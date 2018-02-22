package com.devschool.serializable_demo;

public class Demo implements java.io.Serializable {
    // TODO: below member will be serialized
    public int a;
    public String b;

    // TODO: Now making member to excluded from serializable
    public static final String Name = "Avinash Ranjan";
    transient String myTitle;


    public Demo(int a, String b, String myTitle) {
        this.a = a;
        this.b = b;
        this.myTitle = myTitle;
    }

}
