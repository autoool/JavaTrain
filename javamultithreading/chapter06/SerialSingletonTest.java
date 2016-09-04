package chapter06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialSingletonTest {

	public static void main(String[] args) {
		try {
			SeriealSingleton seriealSingleton = SeriealSingleton.getInstance();
			FileOutputStream fos = new FileOutputStream(new File("serial.txt"));
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(seriealSingleton);
			oos.close();
			fos.close();
			System.out.println(seriealSingleton.hashCode());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis = new FileInputStream(new File("serial.txt"));
			ObjectInputStream ois = new ObjectInputStream(fis);
			SeriealSingleton seriealSingleton = (SeriealSingleton) ois.readObject();
			ois.close();
			fis.close();
			System.out.println(seriealSingleton.hashCode());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
