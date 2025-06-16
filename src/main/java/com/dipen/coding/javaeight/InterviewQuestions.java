package com.dipen.coding.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewQuestions {
    //1. separate odd and even numbers
    //partitioningBy returns the key either true or false based upon predicate
    //it divides into two half based upon the predicate
    public static void separateOddEven(int [] numbers){
        Map<Boolean, List<Integer>> partition= Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.partitioningBy(number->number% 2==0));
        System.out.println("Even"+partition.get(true));
        System.out.println("Odd"+partition.get(false));
    }
    public static void main(String[] args) {
        int [] numbers={1,2,3,4,5,6,7,8,9};
        InterviewQuestions.separateOddEven(numbers);
    }
}
