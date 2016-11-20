package chapter15;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) {
		File file = new File("server.pem");
		try {
			InputStream inputStream = new FileInputStream(file);
			byte b[] = new byte[(int)file.length()];
			inputStream.read(b);
			inputStream.close();
			System.out.println(new String(b,0,b.length));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
