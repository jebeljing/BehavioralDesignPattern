package com.pluralsight.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jingshanyin on 9/7/17.
 */
public class IteratorEverydayDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

        for (String name: names) {
            System.out.println(name);
        }

        System.out.println(names.size());
    }
}
