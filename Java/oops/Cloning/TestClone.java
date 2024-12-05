package com.anu.learning.oops.Cloning;

import java.util.AbstractSequentialList;
import java.util.List;

public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student st1 = new Student(101, "Shyam");
        Student st2 = (Student) st1.clone();
        System.out.println(st1.roll + " " + st1.name + " " + st1.hashCode());
        System.out.println(st2.roll + " " + st2.name + " " + st2.hashCode());
    }
}
