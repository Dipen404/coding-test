package com.dipen.coding.array;

import java.util.Arrays;
public class ReverseArray {
    public static void getReverseArray(int [] array){ //O(n)
        int start=0;
        int end=array.length-1;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }
    public static void getReverseArrayFor(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int [] numbers={4,6,1,8,2};
        ReverseArray.getReverseArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
