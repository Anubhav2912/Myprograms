package com.anu.learning.oops.threading;

public class MyClass {
    public static void main(String[] args) throws Exception {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        Thread.sleep(5000);
        thread.setName("Default thread of main method of MyClass");
        System.out.println(thread.getName());

    }
}
