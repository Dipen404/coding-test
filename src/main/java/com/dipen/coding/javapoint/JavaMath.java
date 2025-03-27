package com.dipen.coding.javapoint;
//java math has several static methods
public class JavaMath {
    public static void main(String[] args) {
        //max
        System.out.println(Math.max(3,5));
        //min
        System.out.println(Math.min(15,9));
        //abs gives positive value
        System.out.println(Math.abs(-25));
        //pow
        System.out.println(Math.pow(2,3)); //gives double need to cast to if used as int (int)Math.pow(2,3)
        //sqrt
        System.out.println(Math.sqrt(16)); //gives double
        //random gives default values from 0 to 1 excluding 1
        System.out.println((int)(Math.random()*100));
        //ceil
        System.out.println(Math.ceil(19.4)); //gives upper number 20.0 returns double
        //floor gives the lowest value
        System.out.println(Math.floor(10.4)); //10.0 as double
        //round will round to nearest integer , if exact middle then round to highest value, 2.5->3, 6.5->, -5.5->-5 5
        // as -5 is high than -6

        System.out.println(Math.round(1.5)); //2
        System.out.println(Math.round(-6.5)); //-6
        System.out.println(Math.round(-3.2)); //-3
        System.out.println(Math.round(2.3)); //2
        System.out.println(Math.round(7.7)); //8
    }
}
