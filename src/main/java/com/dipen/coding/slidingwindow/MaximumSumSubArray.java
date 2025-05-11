package com.dipen.coding.slidingwindow;

//Find the maximum sum of a subarray of size k
//Input: arr = [2, 1, 5, 1, 3, 2], k = 3
//Output: 9 → subarray [5,1,3]

//Use two pointers to represent the window's start and end.
//Calculate the sum of the first window.
//Slide the window one element at a time and update the sum.
//Track the max sum.
public class MaximumSumSubArray {
    public static int sumSubArray(int [] array,int size){
        if(array==null||array.length==0||size==0) return 0;
        int maxSum=0;
        int windowSum=0;
        for(int i=0;i<size;i++){
            windowSum+=array[i];
        }
        maxSum=windowSum;
        for(int i=size;i<array.length;i++){
            windowSum+=array[i]-array[i-size];
            maxSum=Math.max(windowSum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        System.out.println(MaximumSumSubArray.sumSubArray(arr, 3)); // Output: 9
    }
}
