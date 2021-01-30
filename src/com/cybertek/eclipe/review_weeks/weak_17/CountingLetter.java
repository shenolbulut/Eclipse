package com.cybertek.eclipe.review_weeks.weak_17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountingLetter {

    public static void main(String[] args) {
        countLetters("apple");
    }

    public static void countLetters(String str){

        Map<Character, Integer> counter=new LinkedHashMap<>();

        for (int i=0; i<str.length(); i++){

            char key=str.charAt(i);

            if(!counter.containsKey(key)){
                counter.put(key, 0);
            }


            counter.put(key, counter.get(key)+1);


        }
        System.out.println(counter);

        for(Character key: counter.keySet()){
            System.out.println(key+"-"+counter.get(key));
        }
    }



}
