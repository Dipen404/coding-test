package com.dipen.coding.sorting;

//Insertion sort is a simple sorting algorithm that builds the final sorted array at a time. IT's like how you
// sort playing cards in your hand-you pick one card and insert it into its correct position relative to the already
//sorted cards
//start from the second element
// compare it with the elements before it
// shift larger elements one position to the right
// insert the current element at this correct position
// take out current element goes towards left for comparison, if current is less than the left element move the element to right
import java.util.Arrays;
public class InsertionSort {
    public static void insertionSort(int [] inputArray){
        for(int i=1;i<inputArray.length;i++){
            int currentValue=inputArray[i];
            int j=i-1;
            while(j>=0 && inputArray[j]>currentValue){
                inputArray[j+1]=inputArray[j];
                j--;
            }
            inputArray[j+1]=currentValue;
        }
    }
    public static void main(String[] args) {
        int [] numbers={6,2,4,1,7,9};
        System.out.println("before sort "+Arrays.toString(numbers));
        InsertionSort.insertionSort(numbers);
        System.out.println("after sort "+Arrays.toString(numbers));
    }
}
// loop starts from index 1, because we assume the element at index 0 is trivially sorted
// i is the index of current element we want to insert into the sorted portion of the array (which is from index 0 to i-1)
// currentValue holds the element we are going to insert in the correct position
// j is used to traverse the sorted portion of the array (backwards), comparing currentValue to each element
// while loop moves elements that are greater than currentValue one position to the right, making the room for insertion
// it continues shifting until:
// j reaches the start of the array, or
// an element smaller than or equal to currentValue is found
// after finding the correct position, we insert currentValue at j+1