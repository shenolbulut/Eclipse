package com.cybertek.eclipe.review_weeks.weak_17;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set1=new HashSet<>();
        set1.add("a");
        set1.add("a");
        set1.add("z");
        set1.add("d");
        set1.add("k");
        set1.add(".");
        set1.add(null);
        set1.add("3");
        System.out.println(set1.toString());

        Set<String> set2=new LinkedHashSet<>(  );
        set2.add("a");
        set2.add("a");
        set2.add("z");
        set2.add("d");
        set2.add("k");
        set2.add(".");
        set2.add(null);
        set2.add("3");
        System.out.println(set2.toString());

        Set<String> set3=new TreeSet<>();
        set3.add("a");
        set3.add("a");
        set3.add("z");
        set3.add("d");
        set3.add("k");
        set3.add(".");

        set3.add("3");
        System.out.println(set3.toString());

        String str= "asdfadfasdfadf";

        Set<String> set= new TreeSet<>(Arrays.asList(str.split("")));
        System.out.println(set);
    }
}
