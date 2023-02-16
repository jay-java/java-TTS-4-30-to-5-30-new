package core;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {
	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("t2.txt");
		String s = "file handling by file write and reader";
		fr.write(s);
		fr.flush();
		fr.close();
		System.out.println("written");
		
		FileReader f = new FileReader("t2.txt");
		int i;
		while((i = f.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
