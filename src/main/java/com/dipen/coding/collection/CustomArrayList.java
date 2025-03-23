package com.dipen.coding.collection;
import java.util.*;
//custom implementation of ArrayList
// add(item), add(index, item), get(index) remove(index),contains(item),size(),isEmpty(),resize(), print()
public class CustomArrayList {
    public int [] array;
    public int size;

    public CustomArrayList(int initialCapacity){
        array=new int[initialCapacity];
        size=0;
    }
    public void add(int element){
        if(size==array.length){
            resize();
        }
        array[size]=element;
        size++;
    }
    public void resize(){
        int newCapacity=array.length*2;
        int [] newArray=new int [newCapacity];
        for(int i=0;i<array.length;i++){
            newArray[i]=array[i];
        }
        array=newArray;
    }
    public void print(){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String [] args){

    }
}
