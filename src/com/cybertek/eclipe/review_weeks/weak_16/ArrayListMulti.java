package com.cybertek.eclipe.review_weeks.weak_16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMulti {
    public static void main(String[] args) {

        List<String> list1=new ArrayList<>();
        list1.add("a");
        list1.add("a");//it can collect the same datas
        ArrayList<String> list2=new ArrayList<>();
        List<String> list3 =new ArrayList<>();
        list3.add("z");

        //to do multi dimencial ArrayList
        List<List<String>> multiList=new ArrayList<>();
        multiList.add(list1);
        multiList.add(list2);
        multiList.add(list3);

        System.out.println(multiList.get(0).get(0));
        System.out.println(multiList.get(2).get(0));//all the data has the index number and this List objects
        // can be resizeable




    }
}
