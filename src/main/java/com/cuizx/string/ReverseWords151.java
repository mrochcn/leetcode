package com.cuizx.string;

import java.util.Stack;

public class ReverseWords151 {
    public static void main(String[] args) {
        String s = "  hello world!  ";
        String s1 = reverseWords(s);
        System.out.println(s1);
    }
    public static String reverseWords(String s) {
        String trim1 = s.trim();
        String[] strs = trim1.split(" +");
        Stack<String> stack = new Stack<>();
        int idx = 0;
        for (String str : strs) {
            String strTrim = str.trim();
            if (strTrim.equals(" ")) {
                continue;
            }
//            System.out.println(strTrim + idx);
            stack.push(strTrim);
            idx++;
        }
        String ans = "";
        while (!stack.isEmpty()) {
            ans = ans + " " + stack.pop();
        }
//        System.out.println(ans);
        String trim = ans.trim();
        return trim;
    }
}
