package com.dipen.coding.searching;

import javax.naming.PartialResultException;

//this is best for sorted array
//it has time complexity of O(logn)
//it divides search to half excluding the remaining half until the value if reached
public class BinarySearch {
    public static int search(int target, int [] array){
        int start=0;
        int end =array.length-1;

        while(start<=end){
            //int mid=(start+end)/2; // this could have overflow if start and end are too large
            int mid=start+(end-start)/2;
            if(target==array[mid]){
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
    public static void main(String [] args){
        int [] array={1,5,7,9,13,15,17,24,79,89,100};
        int target=15;
        System.out.println(target+" found at index "+BinarySearch.search(target,array));
    }
}
