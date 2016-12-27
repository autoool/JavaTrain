package chapter01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationUtils {
	private static String FILENAME = "H:/JavaProject/obj.bin";
	public static void writeObject(Serializable s) {
		try {
			ObjectOutputStream objectOutputStream = new
					ObjectOutputStream(new FileOutputStream(FILENAME));
			objectOutputStream.writeObject(s);
			objectOutputStream.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static Object readObject(){
		Object object = null;
		try {
			ObjectInput input = new ObjectInputStream(new FileInputStream(FILENAME));
			object = input.readObject();
			input.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return object;
	}
}
