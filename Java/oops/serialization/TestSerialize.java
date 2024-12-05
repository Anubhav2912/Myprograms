package com.anu.learning.oops.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialize {
    public static void main(String[] args) throws Exception {
        Serialize s1 = new Serialize(1001, "Avinash");
        FileOutputStream fout = new FileOutputStream("Student.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(s1);
        out.flush();
        out.close();
        System.out.println("Success");
    }
}
