package com.dipen.coding.javapoint;
//recursion is function calling itself
//should have certain minimal condition or base condition for stopping function
//calling function with new parametirized value
public class Recursion {
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int sum(int n){//get sum from 1 to n
        if(n==0) return 0;
        return n+sum(n-1);
    }
    public static String reverseString(String string){
        if(string.isEmpty()) return "";
        return string.substring(1)+string.charAt(0);
    }
    public static void main(String [] args){
        int number=5;
        System.out.println("Factorial of "+number+" is "+Recursion.factorial(number));
        int n=100;
        System.out.println("sum upto "+n+" is "+Recursion.sum(n));
        String string ="dipendra hamal";
        System.out.println("reverse of "+string+" is "+Recursion.reverseString(string));
    }
}
