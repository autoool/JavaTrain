package chapter15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("word.txt");
		try {
			FileOutputStream outputStream = new FileOutputStream(file);
			byte but[] = "我有一只小猫刘，".getBytes();
			outputStream.write(but);
			outputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fStream = new FileInputStream(file);
			byte byt[] = new byte[1024];
			int len = fStream.read(byt);
			System.out.println(new String(byt,0,len));
			fStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	

	}

}
