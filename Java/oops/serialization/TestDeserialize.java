package com.anu.learning.oops.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserialize {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("Student.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        Serialize s = (Serialize) in.readObject();
        System.out.println(s.id + " " + s.name);
        in.close();
    }
}
