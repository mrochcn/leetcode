package com.cuizx.design;

import java.util.HashMap;
import java.util.Map;

public class TimeMap981 {

    Map<String, String> map;
    /** Initialize your data structure here. */
    public TimeMap981() {
        map = new HashMap<>();
    }


    public void set(String key, String value, int timestamp) {
        map.put(key, value + "#" + timestamp);
    }

    public String get(String key, int timestamp) {

        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {

        }

        return null;
    }
}
