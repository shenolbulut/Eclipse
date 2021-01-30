package com.cybertek.eclipe.review_weeks.weak_17;

import java.util.HashMap;
import java.util.Map;

public class MapStringTask {

    public static void main(String[] args) {
        Map<String, String> map=new HashMap<>();
        map.put("a", "apple");
        map.put("b", "banana");
        System.out.println(map );
        System.out.println(compareStrings(map));
    }

    public static Map<String, String> compareStrings(Map<String, String> map){

        if(map.containsKey("a")&&map.containsKey("b")) {

            if (map.get("a").length() == map.get("b").length()) {
                map.put("a", "");
                map.put("b", "");
            }else{
                map.put("c", map.get("a").length()>map.get("b").length()?map.get("a") : map.get("b"));
            }
        }
        return map;
    }
}
