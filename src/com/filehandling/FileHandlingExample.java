package com.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileHandlingExample {

	public static void main(String[] args) {

		File folder = new File("C:/folder");

		try {
			if (!folder.exists()) {
				folder.mkdir();
			}

			File fileWriterFile = new File(folder, "example.txt");
			File bufferedFile = new File(folder, "buffer.txt");

			// -------- FileWriter (write to example.txt) --------
			FileWriter fw = new FileWriter(fileWriterFile);
			fw.write("This is written using FileWriter.\n");
			fw.write("FileWriter writes characters directly.\n");
			fw.close();

			System.out.println("Written using FileWriter.");

			// -------- FileReader (read from example.txt) --------
			FileReader fr = new FileReader(fileWriterFile);
			char[] arr = new char[(int) fileWriterFile.length()];
			fr.read(arr);
			fr.close();

			System.out.println("Reading using FileReader:");
			System.out.println(new String(arr));

			System.out.println("--------------------------------");

			// -------- BufferedWriter (write to buffer.txt) --------
			BufferedWriter bw = new BufferedWriter(new FileWriter(bufferedFile));
			bw.write("This is written using BufferedWriter.\n");
			bw.write("BufferedWriter is faster and efficient.\n");
			bw.close();

			System.out.println("Written using BufferedWriter.");

			// -------- BufferedReader (read from buffer.txt) --------
			BufferedReader br = new BufferedReader(new FileReader(bufferedFile));
			String line;

			System.out.println("Reading using BufferedReader:");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
