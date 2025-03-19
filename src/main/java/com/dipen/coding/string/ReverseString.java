package com.dipen.coding.string;

public class ReverseString {
    //This uses in built string builder of string buffer reverse method to reverse a string
    public static String reverseStringOne(String string){
        return new StringBuffer(string).reverse().toString();
    }
    //This reverses string by concating from last index to first
    public static String reverseStringTwo(String string){
        String reverse="";
        for(int i=string.length()-1;i>=0;i--){
            reverse+=string.charAt(i);
        }
        return reverse;
    }
    //This reverses string by exchanging of left and right chars
    public static String reverseThree(String string){
        char[] stringArr=string.toCharArray();
        int start=0;
        int end=string.length()-1;
        while(start<end){
            char temp=stringArr[start];
            stringArr[start]=stringArr[end];
            stringArr[end]=temp;
            start++;
            end--;

        }
        return new String(stringArr);
    }
    //This reverse string using recursion
    public static String reverseFour(String string){
        if(string.isEmpty()){
            return string;
        }
        return reverseFour(string.substring(1))+string.charAt(0);
    }
    public static void main(String[] args) {
        String string ="This is sample text again .";
        //String reverseOne=ReverseString.reverseStringOne(string);
        //String reverseTwo=ReverseString.reverseStringOne(string);
        //String reverseThree=ReverseString.reverseThree(string);
        String reverseFour=ReverseString.reverseFour(string);
        System.out.println(reverseFour);
    }
}
