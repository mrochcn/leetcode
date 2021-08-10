package com.cuizx;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class RemoveList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("aaa");
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "aaa".equals(s);
            }
        });
        list.removeIf(s -> s.contains("c"));
        for (String s : list) {
            System.out.println(s);
        }
    }
}
