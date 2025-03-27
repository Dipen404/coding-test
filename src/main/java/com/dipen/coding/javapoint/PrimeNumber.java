package com.dipen.coding.javapoint;

import java.awt.*;

//find given number is prime of not

public class PrimeNumber {
    //this approach has time complexity of o(n) as it checks entire loop upto n
    // but it could be make more optimise in terms of O(squarroon n)
    public static boolean checkPrime(int number){
        if(number<=1){
            return false;
        }
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    //optimal by looping upto squar root of n
    public static boolean checkPrimeSqareRoot(int number){
        if(number<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    //more efficient by excluding even numbers
    public static boolean checkPrimeExcludeEven(int number){
        if(number<=1){// less than equal to 1 are not prime
            return false;
        }
        if(number==2){//as 2 is exceptional even number with prime so should be checked first
            return true;
        }
        if(number%2==0){//all others even numbers are not prime
            return false;
        }
        for(int i=3;i<=Math.sqrt(number);i+=2){
            if(number%i==0){//eqactly dividing by certain number is not prime
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        int number=37;
        System.out.println("number "+number+" is "+(PrimeNumber.checkPrime(number)?"Prime":"not Prime"));
        int num=17;
        System.out.println("number "+num+" is "+(PrimeNumber.checkPrimeSqareRoot(num)?"Prime":"not Prime"));
        int n=15;
        System.out.println("number "+n+" is "+(PrimeNumber.checkPrimeSqareRoot(n)?"Prime":"not Prime"));
    }
}
