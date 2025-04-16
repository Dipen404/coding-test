package com.dipen.coding.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {
    public static void bubbleSort(int [] array){
        int len=array.length;
        for(int i=0;i<len-1;i++){
            boolean swapped=false;
            for(int j=0;j<len-1-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static int linearSearch(int [] array, int target){
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int [] array, int target){
        int len=array.length;
        int start=0;
        int end=len-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[mid]==target){
                return mid;
            }
            else if(target<array[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void insertionSort(int [] array){
        int len=array.length;
        for(int i=1;i<len;i++){
            int currentValue=array[i];
            int j=i-1;
            while(j>=0 && array[j]>currentValue){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=currentValue;
        }
    }
    public static void selectionSort(int [] array){
        int len=array.length;
        for(int i=0;i<len;i++){
            int minIndex=i;
            for(int j=i+1;j<len;j++){
                if(array[j]<array[minIndex]){
                    minIndex=j;
                }
            }
            int temp=array[i];
            array[i]=array[minIndex];
            array[minIndex]=temp;
        }
    }
    public static void mergeSort(int [] array){
        int len=array.length;
        if(len<2){
            return;
        }
        int mid=len/2;
        int [] leftHalf=Arrays.copyOfRange(array, 0, mid);
        int [] rightHalf=Arrays.copyOfRange(array,mid, len);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(array,leftHalf,rightHalf);
    }
    private static void merge(int [] array, int [] leftHalf, int [] rightHalf){
        int leftSize=leftHalf.length;
        int rightSize=rightHalf.length;

        int i=0,j=0,k=0;

        while(i<leftSize && j<rightSize){
            if(leftHalf[i]<=rightHalf[j]){
                array[k]=leftHalf[i];
                i++;
            }else{
                array[k]=rightHalf[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            array[k]=leftHalf[i];
            i++;
            k++;
        }
        while(j<rightSize){
            array[k]=rightHalf[j];
            j++;
            k++;
        }
    }
    public static void main(String [] args){
        int [] numbers={9,8,7,6,5,4,3,2,1,3,5,89,78,100,24,58};
        System.out.println("before sort "+Arrays.toString(numbers));
        //Test.bubbleSort(numbers);
        //Test.insertionSort(numbers);
        //Test.selectionSort(numbers);
        Test.mergeSort(numbers);
        System.out.println("after sort "+Arrays.toString(numbers));
        int [] nums={1,4,7,9,89,500};
        int target=40;
        //System.out.println(target+" found at index "+Test.linearSearch(numbers,target));
        int tar=890;
        //System.out.println(tar+" found at index "+Test.binarySearch(nums,tar));
    }
}
