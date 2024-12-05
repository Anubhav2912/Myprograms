package com.anu.learning.oops.Iostreams.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInputStream {
    public static void main(String[] args) throws Exception {

        FileInputStream fin = new FileInputStream("Dummyfile.txt");
        BufferedInputStream bin = new BufferedInputStream(fin);
        int i;
        while ((i = bin.read()) != -1) {
            System.out.println((char) i);
        }
        bin.close();
        fin.close();
    }
}