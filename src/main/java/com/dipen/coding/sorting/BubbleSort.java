package com.dipen.coding.sorting;
import java.util.Arrays;
//It is one of the simplest sorting algorithm, it repeatedly steps through the list, compares adjacent items, and swaps
// them if they are in the wrong order. The algorithm gets its name from the way smaller elements bubble to the top
//of the list with each pass
//1. Start at the beginning of the array
//2. Compare adjacent elements. If the first element is greater than the second element, swap them.
//3. Move to the next pair of adjacent elements and repeat the process.
//4. After each pass through the list, the largest unsorted element will have bubbled up to its correct position
//5. Continue the process for the remaining unsorted elements until the entire list is sorted
public class BubbleSort { //O(n^2) since two nested loop is used
    public static void getBubbleSort(int [] array){
        int length=array.length;
        for(int i=0;i<length-1;i++){ //total of length-1 passes required, already sorted in the length-1th pass
            for(int j=0;j<length-1-i;j++){ //-i means i elements are already sorted, no need of comparison
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void getOptimizedBubbleSort(int [] array){
        int n=array.length;

        for(int i=0;i<n-1;i++){ //for number of passes
            boolean swapped=false; //flag to see if swapped happened
            //inner loop controls the comparison and swap
            for(int j=0;j<n-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swapped=true;
                }
            }
            //if no elements were swapped in the inner loop the array is already sorted
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int [] numbers={6,7,4,9,1,2,3,3,4,4};
        System.out.println("before sort "+Arrays.toString(numbers));
        BubbleSort.getBubbleSort(numbers);
        System.out.println("after sort "+Arrays.toString(numbers));

        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("before sort "+Arrays.toString(arr));
        BubbleSort.getOptimizedBubbleSort(arr);
        System.out.println("after sort "+Arrays.toString(arr));
    }
}
