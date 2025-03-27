package com.dipen.coding.javapoint;
//find fibonaci upto n numbers
public class Fibonacci {
    public static void getFibonacci(int n){
        int n1=0;
        int n2=1;
        System.out.print(n1+" "+n2+" ");
        for(int i=1;i<n-1;i++){
            int temp=n2;
            n2=n1+n2;
            n1=temp;
            System.out.print(n2+" ");
        }
    }
    public static void main(String [] args){
        Fibonacci.getFibonacci(10);
    }
}
