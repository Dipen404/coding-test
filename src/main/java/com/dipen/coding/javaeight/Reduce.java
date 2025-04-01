package com.dipen.coding.javaeight;
//reduce method in java 8
//reduce method in stream api is a terminal operation that aggregates elements of a stream into a single result
// performs reductions such as summing, multiplying, concatenating, finding max and minimum
// it takes a binary operator, a function that combines two elements and produces a result.

//Optional<T> reduce(BinaryOperator<T> accumulator)
//T reduce(T identity, BinaryOperator<T> accumulator)
//A BinaryOperator<T> is a functional interface that defines a binary operation on two operands of the same type(T)
// and produces a result of the same type.
//identity is an initial default value that is returned if the stream is empty
import java.util.*;
public class Reduce {
    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5);
        //1. Summing the elements
        int sum=numbers
                .stream()
                .reduce(0,Integer::sum);
                //.reduce(0,(a,b)->a+b)
        System.out.println("sum is "+sum); //output 15
        //2. Multiplying the elements
        int mul=numbers
                .stream()
                .reduce(1,(a,b)->a*b);
        System.out.println("multiply is "+mul); //output 120
        //3. Finding the maximum elements
        Optional<Integer> max=numbers
                                    .stream()
                                    .reduce(Integer::max);
        max.ifPresent(System.out::println); //output 5
        int maximum=numbers.stream().reduce((a,b)->a>b?a:b).get();
        System.out.println("max is "+maximum);
        //4. Concatenating Strings
        List<String> stringList=List.of("Hello"," ","Java"," ","Enjoy","!");
        String combinedText=stringList
                .stream()
                .reduce("",(a,b)->a+b);
        System.out.println(combinedText);
        //5. Flattening nested collections
        List<List<Integer>> nested= List.of(List.of(1,2),List.of(3,4),List.of(5,6));
        List<Integer> flattened=nested.stream().reduce(new ArrayList<>(), (a,b)->{
            a.addAll(b);
            return a;
        });
        System.out.println(flattened);
    }
}
