package org.bootstrap.CollectionFramework;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String ,Integer> countries = new HashMap<>();
        countries.put("India",07);
        countries.put("Karnataka",003);
        countries.put("pak",22);

        countries.replace("russia",22);
        System.out.println(countries.containsKey(22));
        System.out.println(countries.containsValue("russia"));


       countries.remove(22,"pak");



        countries.clear();
        countries.replace("russia",22);
        System.out.println(countries.containsValue("India"));
        System.out.println(countries);

        for(String i:countries.keySet()){
            System.out.println(i);
        }

    }



}
