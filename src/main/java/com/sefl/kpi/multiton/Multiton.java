package com.sefl.kpi.multiton;

import com.sefl.kpi.builder.Phone;

import java.util.HashMap;

public class Multiton {
    private static HashMap<String, Phone> instances = new HashMap<>();
    public static Phone getInstance(String name) {
        if(!instances.containsKey(name)){
            instances.put(name,new Phone());
        }

        return instances.get(name);
    }

    private Multiton() {

    }

    public static String toStringMethod() {
        return "Multiton{"+instances+"}";
    }
}
