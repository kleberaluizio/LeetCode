package com.kleberaluizio.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWordsFromTwoSentences_884 {
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        uncommonFromSentences(s1,s2);
    }
    public static String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        String[] st1 = s1.split(" ");
        String[] st2 = s2.split(" ");
        List<String> list = List.of(st1);
        list.addAll(List.of(st2));


        for(int i = 0; i < list.size() ; i++){
            if (!map.containsKey(list.get(i))){
                map.put(list.get(i),1 );
            }
        }

        for (String s : map.keySet()) {
            System.out.println(s);
        }
        return map.keySet().toArray(new String[map.keySet().size()]);
    }
}
