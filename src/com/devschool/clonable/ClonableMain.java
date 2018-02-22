package com.devschool.clonable;

public class ClonableMain {
    public static void main(String[] args) {
        MyName mMyName1 = new MyName();
        mMyName1.setName("Avinash Pandey");
        System.out.println("mMyName1: getName(): "+mMyName1.getName());
        try {
            MyName mMyName2 = (MyName) mMyName1.clone();
            System.out.println("mMyName2 is clone of mMyName1");
            System.out.println("mMyName2: getName(): "+mMyName2.getName());
            System.out.println(("Is both pointing to same memory address: " + mMyName1).equals(mMyName2));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}


