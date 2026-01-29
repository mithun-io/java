package com.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileStreamExample {

    public static void main(String[] args) {

        File folder = new File("C:/folder");

        try {
            if (!folder.exists()) {
                folder.mkdir();
            }

            File streamFile = new File(folder, "stream.txt");

            // -------- FileOutputStream (write to stream.txt) --------
            FileOutputStream fos = new FileOutputStream(streamFile);
            String data = "This is written using FileOutputStream.\n"
                        + "FileOutputStream writes data in bytes.\n";

            fos.write(data.getBytes());
            fos.close();

            System.out.println("Data written using FileOutputStream.");

            // -------- FileInputStream (read from stream.txt) --------
            FileInputStream fis = new FileInputStream(streamFile);
            int ch;

            System.out.println("Reading using FileInputStream:");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
