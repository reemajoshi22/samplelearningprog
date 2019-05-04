package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectFromFile {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileInputStream file = new FileInputStream(new File(
					"E:\\serialization.ser"));
			ObjectInputStream in = new ObjectInputStream(file);
			// Method for deserialization of object
			DemoSerialization object1 = (DemoSerialization) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
			System.out.println("a1 = " + object1.a1);
			System.out.println("b1 = " + object1.b1);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
