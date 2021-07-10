package com;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;

public class FileHandling {

	public static void main(String[] args) {
		String text = "Lama Alosaimi, graduate from information systems";
		try {
			FileWriter writer = new FileWriter("demo1.txt");
			writer.write(text);
			writer.flush();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		///////////////////////////

		try {
			FileReader reader = new FileReader("demo1.txt");
			FileWriter writer = new FileWriter("demo.txt");
			int c = 0;
			while ((c = reader.read()) != -1) {
				writer.write(c);
				writer.flush();

			}

			writer.close();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
