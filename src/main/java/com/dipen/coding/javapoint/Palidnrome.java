package com.dipen.coding.javapoint;

public class Palidnrome {
    //check string is palindrome or not
    public static boolean checkStringPalindrome(String string){
        char[] charArr=string.toCharArray();
        int start=0;
        int end =charArr.length-1;
        while(start<end){
            if(charArr[start]!=charArr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean checkNumberPalindrome(int number){
        int originalNum=number;
        int reverse=0;
        while(number!=0){
            int rem=number%10;
            reverse=reverse*10+rem;
            number=number/10;
        }
        return originalNum==reverse;
    }
    public static void main(String [] args){
        String text="madam";
        System.out.println(text+ (Palidnrome.checkStringPalindrome(text)?" is palindrome":" is not palindrome"));

        int number=121;
        System.out.println(number+ (Palidnrome.checkNumberPalindrome(number)?" is palindrome":" is not palindrome"));

    }
}
