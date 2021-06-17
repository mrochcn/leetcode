package com.cuizx.interview;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Interview04 {

    public List<Integer> getTop10(List<int[]> list) {
        List<Integer> integerList = new LinkedList<>();
        List<Integer> ans = new LinkedList<>();

        for (int[] arr : list) {
            if (arr.length == 1) {
                integerList.add(arr[0]);
            } else {
                if (isAsc(arr)) {
                    integerList.add(arr[arr.length - 1]);
                } else {
                    integerList.add(arr[0]);
                }
            }
        }
        Collections.sort(integerList, (o1, o2) -> o2 - o1);
        for (int i = 0; i < 10; i++) {
            ans.add(integerList.get(i));
        }
        return ans;
    }
    //判断给定的数组是升序还是降序
    public boolean isAsc(int[] arr) {
        if (arr[0] < arr[1]) {
            return true;
        } else {
            return false;
        }
    }
}
