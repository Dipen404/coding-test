package com.dipen.coding.leetcode;

import java.util.HashSet;
import java.util.Set;

//given an integer array, return true if any value appears at least twice in the array
// and return false if every element is distict
public class ContainsDuplicate {
    //this approach is less optimal as it need to add all the items iterating through loop
    public static boolean checkDuplicate(int [] array){
        Set<Integer> set = new HashSet<>();
        for(int item:array){
            set.add(item);
        }
        return (array.length!=set.size());
    }
    //this is optimal set.add returns false if already item in the set and true if the item is newly added in set
    public static boolean checkDuplicateElement(int [] array){
        Set<Integer> set = new HashSet<>();
        for(int item: array){
            if(!set.add(item)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] array={2,4,5,6,2};
        System.out.println(ContainsDuplicate.checkDuplicate(array));
        System.out.println(ContainsDuplicate.checkDuplicateElement(array));
    }
}
