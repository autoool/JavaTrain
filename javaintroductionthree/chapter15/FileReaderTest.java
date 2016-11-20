package chapter15;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderTest {

	public static void main(String[] args) {
		File file = new File("word1.txt");
		try {
			FileWriter out = new FileWriter(file);
			String str = "file reader test";
			out.write(str);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		try {
			FileReader fReader = new FileReader(file);
			char ch[] = new char[1024];
			int len = fReader.read(ch);
			System.out.println(new String(ch,0,len));
			fReader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
