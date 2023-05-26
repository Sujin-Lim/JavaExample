package ch13;

import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) {
        String input = "D:\\Temp\\org.txt";
        String output = "D:\\Temp\\dup.txt";

//        p533
//        try (FileInputStream fis = new FileInputStream(input);
//             FileOutputStream fos = new FileOutputStream(output)) {
//            int c;
//
//            while ((c = fis.read()) != -1) {
//                fos.write(c);
//            }

//        p541
        try (FileReader fr = new FileReader(input);
        FileWriter fw = new FileWriter(output)){
            int c;

            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
        } catch (IOException e) {
        }
    }
}

