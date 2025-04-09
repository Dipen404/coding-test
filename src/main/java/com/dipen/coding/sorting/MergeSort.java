package com.dipen.coding.sorting;

//Merge sort is a divide and conquer algorithm
//1. Divide : split the array into two halves
//2. Conquer: Recursively sort each half
//3. Combine: Merge the two halves back together in sorted order
import java.util.Arrays;
public class MergeSort {
    public static void mergeSort(int [] inputArray){
        int length=inputArray.length;
        if(length<2){
            return;
        }
        int mid=length/2;
        int [] leftArray=new int[mid]; // int [] leftArray=Arrays.copyOfRange(inputArray,0,mid)
        int [] rightArray=new int [length-mid]; //int [] rightArray=Arrays.copyOfRange(inputArray,mid,length)
        for(int i=0;i<mid;i++){
            leftArray[i]=inputArray[i];
        }
        for(int i=mid;i<length;i++){
            rightArray[i-mid]=inputArray[i];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(inputArray, leftArray, rightArray);
    }
    private static void merge(int [] inputArray, int [] leftHalf, int [] rightHalf){
        int leftSize=leftHalf.length;
        int rightSize=rightHalf.length;

        int i=0,j=0,k=0;
        while(i<leftSize && j<rightSize){
            if(leftHalf[i]<=rightHalf[j]){
                inputArray[k]=leftHalf[i];
                i++;
            }else{
                inputArray[k]=rightHalf[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            inputArray[k]=leftHalf[i];
            i++;
            k++;
        }
        while(j<rightSize){
            inputArray[k]=rightHalf[j];
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
