package com.cuizx.interview;

import java.util.ArrayList;
import java.util.List;

public class Interview02 {
    public static void main(String[] args) {
        Department department = new Department();
    }

    public List<Long> getId(Department department, String depName) {
        List<Long> list = new ArrayList<>();
        dfs(department, list, depName);
        return list;
    }
    public void dfs(Department department, List<Long> list, String depName) {
        if (department == null) {
            return;
        }
        if (department.getName().equals(depName)) {
            list.add(department.getId());
        }
        for (Department departmentChild : department.getChildren()) {
            dfs(departmentChild, list, depName);
        }
    }
}
