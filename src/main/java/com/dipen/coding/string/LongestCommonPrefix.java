package com.dipen.coding.string;
//The "Longest Common Prefix" (LCP) problem is a classic problem where we are given an array of strings,
// and we are asked to find the longest prefix (common to all strings) that exists in every string in the array.
//["flower", "flow", "flight"] output fl
public class LongestCommonPrefix {

    public static String getLongestCommonPrefix(String [] array){
        if(array==null || array.length==0){
            return "";
        }
        String prefix=array[0];

        for(int i=1;i<array.length;i++){
            while(array[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String [] args){
        String [] array={"flower","flow","flight"};
        String prefix=LongestCommonPrefix.getLongestCommonPrefix(array);
        System.out.println("longest common prefix is "+prefix);
    }
}
