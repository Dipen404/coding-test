package com.dipen.coding.wrapperclass;

//present in java.lang.Integer
//byte short and long have same methods
public class IntegerWrapper {
    public static void main(String[] args) {
        //1. int parseInt(String s) converts a String to an int
        //parseInt throws NumberFormatException if the value is not proper number represented by string
        String number="123";
        int num=4;
        System.out.println(number+num); //output 1234
        System.out.println(Integer.parseInt(number)+num); //output 127

        //2. Integer valueOf(String s) returns an Integer object holding value of the given string
        //Integer.valueOf(int i) returns an Integer object holding value of the given string
        System.out.println(Integer.valueOf(number));

        //3. String toString(int i) converts an int to a String
        System.out.println(Integer.toString(num)+"value"); //output 4value

        //4. int compareTo(Integer anotherInteger) compare one Integer to another Integer, non static method
        // but can be only used for wrapper class not for primitive type of int only for Integer
        // numberOne<numberTwo -1
        // numberOne=numberTwo 0
        // numberOne>numberTwo 1
        int first=2343;
        System.out.println(Integer.valueOf(first).compareTo(23456)); //conversion int to Integer then apply compareTo

        Integer one=23432;
        Integer two=5434;
        System.out.println(one.compareTo(two)); //here both are wrapper so no need conversion

        //5. int compare(int x, int y) compares two int values static method
        // first number greater output 1, smaller output -1, equals 0
        System.out.println(Integer.compare(5,7)); // output -1
        System.out.println(Integer.compare(59,23));// output 1
        System.out.println(Integer.compare(1,1)); //output 0

        //6. int max(int a, int b) returns Math.max(a,b)  static methods
        System.out.println(Integer.max(4,6));
        //7. int min(int a, int b) static methods
        System.out.println(Integer.min(7,8));
        //8. int sum(int a, b)
        System.out.println(Integer.sum(43,45));

    }
}
