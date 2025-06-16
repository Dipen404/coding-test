package com.dipen.coding.array;
import java.util.Arrays;

public class ArrayPrograms {
    //1. sum of array elements
    public static int sumOfElements(int [] array){
        int sum=0;
        for(int num:array){
            sum+=num;
        }
        return sum;
    }
    //2. reverse an array
    public static int[] reverseArray(int [] array){
        int [] original=array;
        int left=0;
        int right=original.length-1;
        while(left<right){
            int temp=original[left];
            original[left]=original[right];
            original[right]=temp;
            left++;
            right--;
        }
        return original;
    }
    //3. merge two arrays
    public static int [] mergeArray(int[] first,int [] second){
        int finalLength=first.length+second.length;
        int [] mergedArray=new int [finalLength];
        for(int i=0;i<first.length;i++){
            mergedArray[i]=first[i];
        }
        for(int i=0;i<second.length;i++){
            mergedArray[i+first.length]=second[i];
        }
        return mergedArray;
    }
    public static int [] removeDuplicate(int [] array){
        int [] original=array;
        int length=original.length;
        int [] result=new int [length];
        int count=0;
        for(int i=0;i<length;i++){
            boolean isDuplicate=false;
            for(int j=0;j<count;j++){
                if(original[i]==result[j]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                result[count++]=original[i];
            }
        }
        int [] unique=new int [count];
        for(int i=0;i<count;i++){
            unique[i]=result[i];
        }
        return unique;
    }
    public static int [] removeDupOptimized(int [] array){
        Arrays.sort(array);
        int [] temp=new int [array.length];
        int count=0;
        temp[count++]=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]!=array[i-1]){
                temp[count++]=array[i];
            }
        }
        int [] unique=new int [count];
        for(int i=0;i<count;i++){
            unique[i]=temp[i];
        }
        return unique;
    }
    public static void main(String[] args) {
        int [] numbers={1,2,3,4,5};
        System.out.println("sum of array: "+ ArrayPrograms.sumOfElements(numbers));
        System.out.println("reverse: "+Arrays.toString(ArrayPrograms.reverseArray(numbers)));
        int [] first={1,2,3,4};
        int [] second={5,6,7,8};
        System.out.println("merged array: "+Arrays.toString(ArrayPrograms.mergeArray(first,second)));
        int [] duplicateNums={1,1,1,3,4,5,6,1,6,6};
        System.out.println(("unique: "+Arrays.toString(ArrayPrograms.removeDuplicate(duplicateNums))));
        System.out.println(("unique: "+Arrays.toString(ArrayPrograms.removeDupOptimized(duplicateNums))));
    }
}
