package com.dipen.coding.collection;
import java.sql.SQLOutput;
import java.util.*;
//custom implementation of ArrayList
// add(item), add(index, item), get(index) remove(index),contains(item),size(),isEmpty(),resize(), print()
public class CustomArrayList {

    private int [] array; //for implementation using array
    private int size; //for size of array
    private static final int INITIAL_CAPACITY=10;

    public CustomArrayList(){
        array=new int [INITIAL_CAPACITY];
        size=0;
    }
    // print the array elements
    public void print(){
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }
    //resize array when it is full
    public void resize(){
        int newCapacity=array.length*2;
        int [] newArray=new int [newCapacity];
        for(int i=0;i<array.length;i++){
            newArray[i]=array[i];
        }
        array=newArray;
    }
    //add element at last
    public void add(int element){
        if(size==array.length){
            resize();
        }
        array[size]=element;
        size++;
    }
    //add element at index
    public void add(int index, int element){
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("index: "+index+" size: "+size);
        }
        if(size==array.length){
            resize();
        }
        //shift element towards right
        for(int i=size;i<index;i--){
            array[i]=array[i-1];
        }
        array[index]=element;
        size++;
    }
    //remove element at particular index
    public void remove(int index){
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("index: "+index+" size: "+size);
        }
        //shift elements to left
        for(int i=index;i<size;i++){
            array[i]=array[i+1];
        }
        size--;
    }

    public boolean contains(int element){
        for(int i=0;i<size;i++){
            if(array[i]==element){
                return true;
            }
        }
        return false;
    }
    //get element based upon index
    public int get(int index){
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("index: "+index+" size: "+size);
        }
        return array[index];
    }
    //get size of list
    public int size(){
        return size;
    }
    //check list is empty
    public boolean isEmpty(){
        return size==0;
    }

    public static void main(String [] args){

        CustomArrayList list = new CustomArrayList();
        System.out.println("list is empty?? "+list.isEmpty());
        System.out.println("list size is "+list.size());

        list.add(4);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(2,7);
        //list.print();
        System.out.println(list.contains(1));
        //System.out.println(list.get(0));
        //list.remove(9);
        list.remove(4);
        list.print();
    }
}
