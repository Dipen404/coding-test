package com.dipen.coding.sorting;

import java.util.Arrays;
public class SelectionSort {
    public static void selectionSort(int [] inputArray){
        int length=inputArray.length;
        for(int i=0;i<length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<length;j++){
                if(inputArray[j]<inputArray[minIndex]){
                    minIndex=j;
                }
            }
            //swap the found minimum with the first unsorted element
            int temp=inputArray[minIndex];
            inputArray[minIndex]=inputArray[i];
            inputArray[i]=temp;
        }
    }
    public static void main(String[] args) {
        int [] numbers={9,5,1,7,8,4};
        System.out.println("before sort "+Arrays.toString(numbers));
        SelectionSort.selectionSort(numbers);
        System.out.println("after sort "+Arrays.toString(numbers));
    }
}

// Outer loop iterates through the array
// At each i, the algorithm assumes that the smallest element from i to the end needs to be found and placed at position i
// Assume the minimum element in the unsorted part starts at position i
// Inner loop: starts from the next element after i and searches for a smaller value
// If a smaller element is found, update the minIndex to the index of that smaller value
// Swap: after finding the smallest element in the unsorted portion, swap it with the element at index i
// This places the smallest element at the correct sorted position
