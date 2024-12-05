package com.anu.learning.oops.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("Dummyfile.txt");
        FileInputStream fis = new FileInputStream(file);
        int ich;
        String fileContent = "";
        do {
            ich = fis.read();
            if (ich != -1) fileContent = fileContent + (char) ich;
        } while (ich != -1);

        System.out.println(fileContent);
    }


}
