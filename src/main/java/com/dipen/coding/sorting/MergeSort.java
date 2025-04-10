package com.dipen.coding.sorting;

//Merge sort is a divide and conquer algorithm
//1. Divide : split the array into two halves
//2. Conquer: Recursively sort each half
//3. Combine: Merge the two halves back together in sorted order
import java.util.Arrays;
public class MergeSort {
    // Main method that performs merge sort
    public static void mergeSort(int[] inputArray) {
        int length = inputArray.length;

        // Base case: If array has less than 2 elements, it's already sorted
        if (length < 2) {
            return;
        }

        // Find the midpoint of the array to divide it into two halves
        int mid = length / 2;

        // Create left half array with size mid
        int[] leftArray = new int[mid];

        // Create right half array with size (length - mid)
        int[] rightArray = new int[length - mid];

        // Copy the left half of inputArray into leftArray
        for (int i = 0; i < mid; i++) {
            leftArray[i] = inputArray[i];
        }

        // Copy the right half of inputArray into rightArray
        for (int i = mid; i < length; i++) {
            rightArray[i - mid] = inputArray[i];
        }

        // Recursively sort the left half
        mergeSort(leftArray);

        // Recursively sort the right half
        mergeSort(rightArray);

        // Merge the sorted halves back into the original array
        merge(inputArray, leftArray, rightArray);
    }

    // Helper method to merge two sorted arrays (leftHalf and rightHalf) into inputArray
    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        // i - index for leftHalf, j - index for rightHalf, k - index for inputArray
        int i = 0, j = 0, k = 0;

        // Compare elements of leftHalf and rightHalf and insert the smaller one into inputArray
        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        // If any elements are left in leftHalf, copy them into inputArray
        while (i < leftSize) {
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        // If any elements are left in rightHalf, copy them into inputArray
        while (j < rightSize) {
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
            int [] numbers={6,7,3,2,1,6,9,8};
            System.out.println("before sort "+Arrays.toString(numbers));
            MergeSort.mergeSort(numbers);
            System.out.println("after sort "+Arrays.toString(numbers));
    }
}
