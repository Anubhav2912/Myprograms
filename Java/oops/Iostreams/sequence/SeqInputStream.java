package com.anu.learning.oops.Iostreams.sequence;

import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.io.FileInputStream;

public class SeqInputStream {
    public static void main(String[] args) throws Exception {

        FileInputStream fin1 = new FileInputStream("Dummyfile.txt");
        FileInputStream fin2 = new FileInputStream("samplefile.txt");
        FileOutputStream fout = new FileOutputStream("SampleRunFile.txt");
        SequenceInputStream sin = new SequenceInputStream(fin1, fin2);
        int i;
        while ((i = sin.read()) != -1) {
            fout.write(i);
        }
        sin.close();
        fout.close();
        fin1.close();
        fin2.close();
    }
}
