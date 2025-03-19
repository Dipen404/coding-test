package com.dipen.coding.string;

import java.net.CacheRequest;
import java.util.HashMap;

//Given a string, find the first non-repeating character and return its index. If it doesn't exist, return -1.
//find the count of each character and store character as key and count as value
//if character is present then count+1 else 1
//loop throuh char array and see the first count of i of char array to 1 , if not then -1
public class FirstUniqueCharacterInString {
    public static int firstUniqueCharacter(String string){
        HashMap<Character,Integer> map=new HashMap<>();

        for(char c:string.toCharArray()){
            map.put(c,map.containsKey(c)?map.get(c)+1:1);
            //map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<string.length();i++){
            if(map.get(string.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String string ="leetcode";
        int index=FirstUniqueCharacterInString.firstUniqueCharacter(string);
        System.out.println(index); //output 0 as first unique is l
    }
}
