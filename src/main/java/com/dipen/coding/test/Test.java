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
    public static int [] removeDuplicate(int [] array){
        int [] original=array;
        int length=original.length;
        int count=0;
        int [] result=new int [length];
        for(int i=0;i<length;i++){
            boolean isDuplicate=false;
            for(int j=0;j<count;j++){
                if(original[i]==result[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                result[count]=original[i];
                count++;
            }
        }
        //return result;
        int [] unique=new int[count];
        for(int i=0;i<count;i++){
            unique[i]=result[i];
        }
        return unique;
    }
    public static int[] removeDuplicates(int[] arr) {
        if (arr.length == 0) return new int[0];

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Use a temporary array to collect unique elements
        int[] temp = new int[arr.length];
        int count = 0;

        temp[count++] = arr[0];  // First element is always unique after sorting

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                temp[count++] = arr[i];
            }
        }

        // Step 3: Copy to final array of correct size
        int[] result = new int[count];
        System.arraycopy(temp, 0, result, 0, count);

        return result;
    }
    public static void main(String[] args) {
        //System.out.println("hello java hello");
        //System.out.println(Test.maxLength("abba"));
        int [] numbers={1,1,2,3,2,8,8,8,3};
        int [] unique=Test.removeDuplicate(numbers);
        System.out.print(Arrays.toString(unique));
    }
}


