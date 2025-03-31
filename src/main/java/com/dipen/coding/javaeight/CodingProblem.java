package com.dipen.coding.javaeight;

import java.util.*;
import java.util.stream.Collectors;

public class CodingProblem {
    public static void main(String[] args) {

    }
}
//1. print a list using lambda expression
class PrintList{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,2,6,78,9);
        list.forEach(num->System.out.println(num));
        //list.forEach(System.out::println);
    }
}
//2. filter even numbers from a list using streams
class  FilterEven{
    public static boolean isEven(int num){
        return num%2==0;
    }
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,7,8,4,3,3,6,7,8,8,0);
        list.stream().filter(FilterEven::isEven).forEach(System.out::println);
        List<Integer> even=list.stream().filter(num->num%2==0).collect(Collectors.toList());
        System.out.println(even);
    }
}
//3. find maximum value in a list using streams
class FindMaximum{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,7,899,67);
        int max=list.stream().max(Integer::compare).get(); //max method returns optional
        System.out.println("max is "+max);
        Optional<Integer> maxNum=list.stream().max((a,b)->a-b);
        System.out.println(maxNum.get());
    }
}
//4. convert a list of string to uppercase
class FindUpperCase{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("dipen","hamal","Java","tesT");
        list.stream().map(item->item.toUpperCase()).forEach(System.out::println);
        List<String> upperCase=list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase);
    }
}
//5. group strings by their length using groupingBy
//groupingBy takes one classifier function which is applied to each item in the stream
//result of classifier function is key and the list that matches the function is the values
class GroupBy{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Dipen","Hamal","Java","home","zone","Dipendra","the","as","false");
        Map<Integer,List<String>> map=list.stream().collect(Collectors.groupingBy(String::length));
        Map<Integer,Long> maps=list.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println(map);
        System.out.println(maps);
    }


}
//real case groupingBy example
class Student {
    String name;
    int gradeLevel;

    Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    @Override
    public String toString() {
        return name + " (Grade " + gradeLevel + ")";
    }
}

 class GroupingStudentsByGrade {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", 9),
                new Student("Alice", 10),
                new Student("Bob", 9),
                new Student("Eve", 11),
                new Student("Charlie", 12),
                new Student("David", 10)
        );

        // Group students by grade level
        Map<Integer, List<Student>> groupedByGrade = students.stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel));

        // Print students grouped by grade level
        groupedByGrade.forEach((grade, studentList) -> {
            System.out.println("Grade " + grade + ": " + studentList);
        });
    }
}
//By default groupingBy uses a HashMap to store grouped elements, however you can specify different type of map to store results
 class GroupingByWithTreeMap {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<String, List<Integer>> groupedByParity = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd", TreeMap::new, Collectors.toList()));

        System.out.println(groupedByParity);
    }
}
 class GroupingByWithSet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6);

        Map<String, Set<Integer>> groupedByParitySet = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd", Collectors.toSet()));

        System.out.println(groupedByParitySet);
    }
}
//output {Odd=[1, 3, 5], Even=[2, 4, 6]}