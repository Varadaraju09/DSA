// 1 Write a program to demonstrate checked and unchecked exceptions with examples.

import java.io.*;
public class Problem1 {
    public static void main(String[] args) {
        
        try {
            int a = 10 / 0;
        } catch(ArithmeticException e) {
            System.out.println("Unchecked Exception: "+e);
        }

        try {
            FileReader fr = new FileReader("file.txt");
        } catch (Exception e) {
            System.out.println("Checked Exception: "+e);
        }
    }
}
