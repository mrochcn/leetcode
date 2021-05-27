package com.cuizx.math;


import java.util.LinkedList;
import java.util.List;

public class CompareOutput {

    public static void main(String[] args) {
        getList();
    }

    public static int getRandomStr() {
       int a =  (int) (Math.random() * 2 + 1);
       return a;
    }
    public  static List<String> getList() {
        List<String> list = new LinkedList<>();
        int rightCount = 0;
        int idx = 0;
        while (idx < 100) {
            int a = (int) (Math.random() * 9 + 1);
            int b = (int) (Math.random() * 9 + 1);
            String s;
            if (getRandomStr() == 1) {
                s = ">";
            } else {
                s = "<";
            }
            if ((a > b && s.equals(">")) || (a < b && s.equals("<"))) {
                rightCount++;
            }
            list.add(a + " " + s + " " + b);
            idx++;
        }
        System.out.println(rightCount);
        if (rightCount == 50) {
            for (String s : list) {
                System.out.println(s);
            }
            return list;
        }
        return getList();
    }


}
