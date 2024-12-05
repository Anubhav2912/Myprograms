package com.anu.learning.oops.Iostreams.buffer;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BufferOutputStream {
    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("Dummyfile.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String s = ("This is a content to check Buffer Output Stream.");
        byte b[] = s.getBytes();
        bos.write(b);
        bos.flush();
        bos.close();
        fos.close();
    }
}
