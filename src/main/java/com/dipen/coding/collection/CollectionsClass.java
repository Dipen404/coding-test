package com.dipen.coding.collection;
import java.sql.SQLOutput;
import java.util.*;
public class CollectionsClass {

    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,7,89,1,4,5,3));
        System.out.println(list);
        //1. sort sort given array in ascending order
        Collections.sort(list);
        System.out.println("after sort asc"+list);
        //2. descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("after sort desc"+list);
        //3. reverse the array
        Collections.reverse(list);
        System.out.println("reverse list "+list);
        //4. shuffle this shuffles array in any random order if there is no parameter,
        //if parameter then shuffle in  certain same order everytime
        Collections.shuffle(list);
        System.out.println("after shuffle "+list);
        //5. swap this method will swap between two elements at certain index
        Collections.swap(list,2,6);
        System.out.println(list);
        //6. binarySearch for this the array need to be in sorted order
        // returns negative value if not found
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,7);
        Collections.sort(numbers);
        System.out.println("found at index "+Collections.binarySearch(numbers,30));
        //returns -1 if not found
        List<Integer> sourceList=Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> targetList=Arrays.asList(5,6,5);
        System.out.println(Collections.indexOfSubList(sourceList,targetList));
        //7 thread safe
        List<Integer> nonSync= Arrays.asList(2,3,4);
        List<Integer> sync=Collections.synchronizedList(list);
        //Collections.synchronizedSet(set)
        //Collections.synchronizedMap(map)
        //Collections.synchronizedSortedMap(sortedmap)
        //Collections.synchronizedSortedSet(sortedset)

        //8. emptyList() returns immutable empty list cant change can not add items
        List<String> emptyList=Collections.emptyList();
        //9. emptySet() returns immutable empty set can not change can not add
        Set<String> emptySet=Collections.emptySet();
        //10. emptyMap() returns immutable empty map can not modify can not put
        Map<String,String> emptyMap=Collections.emptyMap();
        //these immutable list, set and map are useful when need to return a list that is
        //guaranteed to be empty and can not be modified

        //11. frequency() method returns the number of occurence of a specified element in a collection
        int frequency =Collections.frequency(numbers,7);
        System.out.println("frequency of occurence of 7 is "+frequency);

        //12. copy() this method copies all the elements from one list to another,
        //destination must me large enough to hold all the elements from source lis

        List<Integer> sourcList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> destList = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0)); // Pre-filled list

        // Copying elements from sourceList to destList
        Collections.copy(destList, sourcList);

        //13. fill () method replaces all elmeents in specified list with a specified element
        // it modifies list but the list size remains unchanged existing values replaced by provided element.
        List<Integer> lists = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Fill the list with the number 10
        Collections.fill(lists, 10);

        //14. min() method returns the min element of a collection, according to natural ordering
        // of its element, if a custom comparator is provided it will return the min based
        //on the comparator ordering

        //natural ordering
        int minElement=Collections.min(numbers);
        System.out.println("min number is "+minElement);

        int maxElement=Collections.max(numbers);
        System.out.println("max number is "+maxElement);
        //custom comparator
        int minimum= Collections.min(numbers, (a,b)->a-b);
        System.out.println("minimum element is "+minimum);

        int maximum= Collections.min(numbers, (a,b)->b-a);
        System.out.println("minimum element is "+maximum);

        // both ways to create new list
        ArrayList<Integer> alist=new ArrayList<>(Arrays.asList(34,4,5));
        List<Integer> iList=Arrays.asList(5,6,7);
    }
}
