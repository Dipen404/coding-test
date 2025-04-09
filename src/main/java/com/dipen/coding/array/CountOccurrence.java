package com.dipen.coding.array;

//count occurrence of any element in array
public class CountOccurrence {
    public static int getOccurrence(int [] array, int target){ //O(n)
        int count=0;
        for(int item:array){
            if(item==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] numbers={1,1,3,4,5,5,6,7,3,4,5};
        int target=5;
        System.out.println("occurrence of "+target+" is "+CountOccurrence.getOccurrence(numbers,target));
    }
}
//for single target search this is ok
//for multiple target search use hashmap

//public static Map<Integer, Integer> getAllOccurrences(int[] array) {
//    Map<Integer, Integer> counts = new HashMap<>();
//    for (int item : array) {
//        counts.put(item, counts.getOrDefault(item, 0) + 1);
//    }
//    return counts;
//}

