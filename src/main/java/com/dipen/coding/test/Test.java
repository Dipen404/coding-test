package com.dipen.coding.test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Test{
    public static int maxSubStringLength(String string){
        int maxLength=0;
        int len=string.length();
        for(int i=0;i<len;i++){
            StringBuilder builder=new StringBuilder();
            for(int j=i;j<len;j++){
                if(builder.indexOf(String.valueOf(string.charAt(j)))!=-1){
                    break;
                }
                builder.append(string.charAt(j));
                maxLength=Math.max(maxLength,builder.length());
            }
        }
        return maxLength;
    }
    public static int maxLength(String string){
        int maxLength=0;
        int len=string.length();
        Map<Character,Integer> seen=new HashMap<>();
        for(int end=0,start=0;end<len;end++){
            if(seen.containsKey(string.charAt(end))){
                start=Math.max(start,seen.get(string.charAt(end))+1);
            }
            maxLength=Math.max(maxLength,end-start+1);
            seen.put(string.charAt(end),end);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println("hello java hello");
        System.out.println(Test.maxLength("abba"));
    }
}


