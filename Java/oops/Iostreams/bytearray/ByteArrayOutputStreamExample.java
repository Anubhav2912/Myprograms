package com.anu.learning.oops.Iostreams.bytearray;

import java.io.*;

public class ByteArrayOutputStreamExample {
    public static void main(String args[]) throws Exception {
        FileOutputStream fout1 = new FileOutputStream("f1.txt");
        FileOutputStream fout2 = new FileOutputStream("f2.txt");

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        String data = "I am practicing byte array output stream";//this data could be a line, a paragraph or could be a complete file.
        bout.write(data.getBytes());
        bout.writeTo(fout1);
        bout.writeTo(fout2);

        bout.flush();
        bout.close();//has no effect
        System.out.println("Success...");
    }
}