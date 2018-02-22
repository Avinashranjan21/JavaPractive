package com.devschool.clonable;

public class MyName implements Cloneable {
    private String name;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
