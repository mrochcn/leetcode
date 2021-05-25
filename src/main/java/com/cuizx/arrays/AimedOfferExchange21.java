package com.cuizx.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class AimedOfferExchange21 {
    public static void main(String[] args) {

    }

    public int[] exchange(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                list2.add(num);
            } else {
                list1.add(num);
            }
        }
        int[] ans = new int[list1.size() + list2.size()];
        for (int i = 0; i < list1.size(); i++) {
            ans[i] = list1.get(i);
        }
        for (int i = list1.size(); i < list2.size() + list1.size(); i++) {
            ans[i] = list2.get(i - list1.size());
        }
        return ans;
    }

}
