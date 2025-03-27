package com.dipen.coding.javapoint;

//power will be the exact length of number
//single digit power 1, double digit power 2, three digit power 3
//sum of power of individual digit equal to the original number
public class Armstrong {
    public static boolean checkArmstrong(int number){
        int length=String.valueOf(Math.abs(number)).length(); //abs to get length
        int original=number;
        int sum=0;
        while(number!=0){
            int rem=number%10;
            sum+=Math.pow(rem,length);
            number=number/10;
        }
        return original==sum;
    }
    public static void main(String [] args){
        int number=153;
        System.out.println(number+(Armstrong.checkArmstrong(number)?" is armstrong":" is not armstrong"));

    }
}
