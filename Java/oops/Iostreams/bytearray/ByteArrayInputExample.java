package TestProject.src.com.anu.learning.oops.Iostreams.bytearray;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;

public class ByteArrayInputExample {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("Dummyfile.txt");
        // Create the new byte array input stream
        byte[] byt = null;
        fin.read(byt);
        int k = 0;
        char ch;
        int i=0;
        while (true) {
            //Conversion of a byte into character
            ch = (char) byt[i++];
            System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
        }
    }
}