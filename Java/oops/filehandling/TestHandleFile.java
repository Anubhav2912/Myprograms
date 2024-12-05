package com.anu.learning.oops.filehandling;

import java.util.Scanner;

public class TestHandleFile {
    public static void main(String[] args) {
        HandleFile file = new HandleFile();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File name : ");
        String filename = sc.nextLine();
        file.create(filename);
        sc = new Scanner(System.in);
        System.out.println("Do you want to write in the file 1-Yes/2-No : ");
        int option = sc.nextInt();
        if (option == 1) {
            file.write();
            System.out.println("Do you want to read in the file ? \n 1 for Yes\n 2 for No");
            int opt = sc.nextInt();
            if (opt == 1) {
                file.read();
            } else {
                System.out.println("Ok Bye!");
            }
        }


    }
}
