package com.cuizx.interview;

import java.util.List;

public class Department {
    private long id;
    private String name;
    private List<Department> children;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getChildren() {
        return children;
    }

    public void setChildren(List<Department> children) {
        this.children = children;
    }
}