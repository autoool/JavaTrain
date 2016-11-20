package chapter15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamTest {
	
	public static void main(String[] args) {
		File file = new File("datastream.txt");
		try {
			FileOutputStream fStream = new FileOutputStream(file);
			DataOutputStream dStream = new DataOutputStream(fStream);
			dStream.writeUTF("wrtieutf");
			dStream.writeBytes("writebytes");
			dStream.writeChars("writechars");
			dStream.close();
			
			FileInputStream fInputStream = new FileInputStream(file);
			DataInputStream dInputStream = new DataInputStream(fInputStream);
			System.out.println("utf:"+dInputStream.readUTF());
			System.out.println("byte:"+dInputStream.readByte());
			System.out.println("char:"+dInputStream.readChar());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
