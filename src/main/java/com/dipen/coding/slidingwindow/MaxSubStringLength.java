package com.dipen.coding.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MaxSubStringLength {
    public static int maxLength(String string){
       int maxLength=0;
       for(int i=0;i<string.length();i++){
           StringBuilder currentSubString=new StringBuilder();
           for(int j=i;j<string.length();j++){
               if(currentSubString.indexOf(String.valueOf(string.charAt(j)))!=-1){
                   break;
               }
               currentSubString.append(string.charAt(j));
               maxLength=Math.max(maxLength,currentSubString.length());
           }
       }
       return maxLength;
    }
    public static int maxSubLength(String string){
        int maxLength=0;
        Map<Character,Integer> seen=new HashMap<>();
        for(int right=0, left=0;right<string.length();right++){
            if(seen.containsKey(string.charAt(right))){
                left=seen.get(string.charAt(right))+1;
                //left = Math.max(seen.get(string.charAt(right)) + 1, left); abba example to run this
                //You risk moving the window's start pointer backward, which causes incorrect substrings to be counted
                // and breaks the sliding window logic.
            }
            maxLength=Math.max(maxLength,right-left+1);
            seen.put(string.charAt(right),right);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(MaxSubStringLength.maxLength("abba"));
        System.out.println(MaxSubStringLength.maxSubLength("abba"));
    }
}

//'a' at index 0 → start = 0 → map = {a:0}
//
//'b' at index 1 → start = 0 → map = {a:0, b:1}
//
//'b' at index 2 → duplicate found!
//→ map.get('b') + 1 = 2, so start = Math.max(0, 2) = 2 ✅
//
//'a' at index 3 → map.get('a') = 0
//If you set start = map.get('a') + 1 = 1, you move start backward! ❌
//So we must do: start = Math.max(2, 1) = 2 ✅
