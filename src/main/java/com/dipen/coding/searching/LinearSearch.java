package com.dipen.coding.searching;
//this is best for unsorted array which has time complexity of O(n)
//it searches entire list for searching given value
public class LinearSearch {

    public static int searchValue(int value, int [] array){
        for(int i=0;i<array.length;i++){
            if(value==array[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int [] array={3,2,6,7,5,9};
        int found=LinearSearch.searchValue(19,array);
        System.out.print("values found at index "+found);
    }
}
