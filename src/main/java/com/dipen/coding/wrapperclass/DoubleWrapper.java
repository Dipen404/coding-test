package com.dipen.coding.wrapperclass;
//similar in float also the first 6 methods
public class DoubleWrapper {
    public static void main(String[] args) {
        //1. double parseDouble(String s) converts string to double
        //2. Double valueOf(String s) returns Double object holding the value of the given string
        //3. Double valueOf(double d) returns a Double object holding the specified double value
        //4. String toString(double d) converts a double to string
        //5. int compare(double d1, double d2) compares two double values
        //6. int compareTo(Double anotherDouble) compares Double object with another Double

        //7. boolean isNan(double d) checks if the value is NaN (not a number)
        double d=34d;
        System.out.println(Double.isNaN(d));
        //8. boolean isInfinite(double v) checks if the value is finite
        //9. boolean isFinite(double v) checks if the value is finite
        //10. boolean isNormal(double v) checks if the value is a normal value

    }
}
