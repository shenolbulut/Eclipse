package com.cybertek.eclipe.review_weeks.weak_16;

import java.util.LinkedList;
import java.util.List;

public class LİnkListExample {
    public static void main(String[] args) {

        List<Integer> list1=new LinkedList<>();
        list1.add(3);
        list1.add(-5);
        list1.add(3);
        list1.add(34);
        System.out.println(list1);

        ((LinkedList) list1).getFirst();//Down casting is mandatory. because this object created with polymorfik way
                                        // getFirst() is belongs to LinkedLinks class.t


    }
}
