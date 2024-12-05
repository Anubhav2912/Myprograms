package com.anu.learning.oops.filehandling;

import java.io.*;
import java.util.Scanner;

public class HandleFile {
    public void create(String fileName) {
        File myFile = new File(fileName);
    }

    public void write() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File name : ");
        String filename = sc.nextLine();
        File myFile = new File(filename);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filename);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Enter the content to write in file : ");
        String content = sc.nextLine();
        try {
            fos.write(content.getBytes());
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File name : ");
        String filename = sc.nextLine();
        File myFile = new File(filename);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int i;
        String strFile = "";
        try {
            while ((i = fis.read()) != -1) {
                strFile += strFile + (char) i;
            }
            System.out.println(strFile);
            fis.close();
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
