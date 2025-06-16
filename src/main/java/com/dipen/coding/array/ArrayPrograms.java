package com.dipen.coding.array;
import java.util.Arrays;

public class ArrayPrograms {
    //1. sum of array elements
    public static int sumOfElements(int [] array){
        int sum=0;
        for(int num:array){
            sum+=num;
        }
        return sum;
    }
    //2. reverse an array
    public static int[] reverseArray(int [] array){
        int [] original=array;
        int left=0;
        int right=original.length-1;
        while(left<right){
            int temp=original[left];
            original[left]=original[right];
            original[right]=temp;
            left++;
            right--;
        }
        return original;
    }
    //3. merge two arrays
    public static int [] mergeArray(int[] first,int [] second){
        int finalLength=first.length+second.length;
        int [] mergedArray=new int [finalLength];
        for(int i=0;i<first.length;i++){
            mergedArray[i]=first[i];
        }
        for(int i=0;i<second.length;i++){
            mergedArray[i+first.length]=second[i];
        }
        return mergedArray;
    }
    public static void main(String[] args) {
        int [] numbers={1,2,3,4,5};
        System.out.println("sum of array: "+ ArrayPrograms.sumOfElements(numbers));
        System.out.println("reverse: "+Arrays.toString(ArrayPrograms.reverseArray(numbers)));
        int [] first={1,2,3,4};
        int [] second={5,6,7,8};
        System.out.println("merged array: "+Arrays.toString(ArrayPrograms.mergeArray(first,second)));
    }
}
