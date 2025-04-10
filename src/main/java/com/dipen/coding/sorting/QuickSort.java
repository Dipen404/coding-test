package com.dipen.coding.sorting;

//Quick sort is a divide-and-conquer sorting algorithm. It works by selecting a pivot element and then
//Partitioning the array so that:
//Elements less than the pivot go the left
//Elements greater than the pivot go the right, so the pivot lands in its final sorted position
//It then recursively applies the same process to the left and the right parts (excluding the pivot)
//You can pick pivot(last element most common approach, first element, random element, median)
//Base Case: If the array has 0 or 1 element, it is already sorted


public class QuickSort {

    // The quickSort method is a recursive function that sorts the array between the indices lowIndex and highIndex.
    public static void quickSort(int [] inputArray, int lowIndex, int highIndex){
        // Base case: if lowIndex is greater than or equal to highIndex, the partitioning is already done
        // (i.e., the array has one or no elements and doesn't need sorting).
        if(lowIndex < highIndex) {
            // Partition the array and get the pivot index where the array is divided into two parts
            int pivotIndex = partition(inputArray, lowIndex, highIndex);

            // Recursively sort the left side of the array (elements before the pivot)
            quickSort(inputArray, lowIndex, pivotIndex - 1); // for left side

            // Recursively sort the right side of the array (elements after the pivot)
            quickSort(inputArray, pivotIndex + 1, highIndex); // for right side
        }
    }

    // The partition method rearranges the elements of the array such that:
    // - Elements smaller than or equal to the pivot are placed to its left.
    // - Elements greater than the pivot are placed to its right.
    private static int partition(int [] inputArray, int lowIndex, int highIndex){
        // Choose the last element as the pivot
        int pivot = inputArray[highIndex]; // The pivot will be the last element in the range

        // i is the index of the smaller element (starts one before the lowIndex)
        int i = lowIndex - 1;

        // Loop through the array from lowIndex to highIndex-1 (one element before the pivot)
        for (int j = lowIndex; j < highIndex; j++) {
            // If the current element is less than or equal to the pivot, it should be on the left side of the pivot
            if (inputArray[j] <= pivot) {
                // Increment i to reflect the new position of the smaller element
                i++;

                // Swap arr[i] with arr[j] to move smaller element to the left side
                int temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
            }
        }

        // After the loop, place the pivot in the correct position (it should be between the smaller and larger elements)
        int temp = inputArray[i + 1];
        inputArray[i + 1] = inputArray[highIndex];
        inputArray[highIndex] = temp;

        // Return the index of the pivot element after placing it in its correct sorted position
        return i + 1; // This is where the pivot is placed
    }

    // Utility method to print the array. It simply prints each element separated by a space.
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " "); // Print the element followed by a space
        }
        System.out.println(); // Print a newline at the end of the output
    }

    public static void main(String[] args) {
        // Example array to demonstrate quick sort
        int[] arr = { 10, 7, 8, 9, 1, 5 };

        // Get the length of the array to pass to the quickSort method
        int n = arr.length;

        // Print the original array before sorting
        System.out.println("Original Array:");
        printArray(arr);

        // Call the quickSort method to sort the array
        quickSort(arr, 0, n - 1);

        // Print the sorted array
        System.out.println("Sorted Array:");
        printArray(arr);
    }
}

