package com.dipen.coding.leetcode;
//missing number in a distinct list of integers from 0 to n
public class MissingDuplicate {
    public static int getMissingDuplicate(int [] array, int n){
        int actualSum=n*(n+1)/2;
        int arraySum=0;
        for(int item:array){
            arraySum+=item;
        }
        return actualSum-arraySum;
    }
    public static void main(String [] args){
        int [] array={0,1};
        System.out.println(MissingDuplicate.getMissingDuplicate(array,2));
    }
}
