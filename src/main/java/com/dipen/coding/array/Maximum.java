package com.dipen.coding.array;

import java.util.Arrays;
public class Maximum {
    public static int linearMaximum(int [] array){ //linear search O(n)
        int maximum=array[0];
        for(int item:array){
            if(item>maximum){
                maximum=item;
            }
        }
        return maximum;
    }
    public static int streamMaximum(int [] array){//O(n) clear concise readable
        return Arrays.stream(array).max().getAsInt();
    }
    public static void main(String[] args) {
        int [] numbers={65,78,90,1,3,100};
        System.out.println("maximum is "+Maximum.linearMaximum(numbers));
        System.out.println("maximum is "+Maximum.streamMaximum(numbers));
    }
}
