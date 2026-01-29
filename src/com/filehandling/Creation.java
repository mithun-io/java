package com.filehandling;

import java.io.File;
import java.io.IOException;

public class Creation {
	public static void main(String[] args) {
		try {
			File folder = new File("C:/folder");

			if (!folder.exists()) {
				folder.mkdir();
				System.out.println("folder created: " + folder.getAbsolutePath());
			}

			File file = new File(folder, "data.txt");

			if (!file.exists()) {
				file.createNewFile();
				System.out.println("file created: " + file.getAbsolutePath());
			} else {
				System.out.println("file already exists.");
			}

		} catch (IOException e) {
			System.out.println("error: " + e.getMessage());
		}
	}
}
