package serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WriteObjectToFile {
	public static void main(String[] args) {
		DemoSerialization demoSerialization = new DemoSerialization(10,
				"Serialization Example");
		try {
			FileOutputStream file = new FileOutputStream(new File(
					"D:\\serialization.ser"));
			ObjectOutputStream out = new ObjectOutputStream(file);
			// Method for serialization of object
			out.writeObject(demoSerialization);
			// out.defaultWriteObject();
			out.close();
			file.close();
			System.out.println("Object has been serialized using default");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class DemoSerialization extends DemoToBeExtended implements Serializable {
	public int a;
	public String b;

	public DemoSerialization(int a, String b) {
		super(100, "parent class extended in class implemnting serialization");
		this.a = a;
		this.b = b;
	}

}

class DemoToBeExtended implements Serializable{
	public int a1;
	public String b1;

	// if the super class is not implementing Serializable then while
	// deserialzation we need default constructor otherwise it will throw
	// java.io.InvalidClassException: serialization.DemoSerialization; no valid 
	// constructor
	
	// if the super class is  implementing Serializable then while
	// super class will be deserialized normally.
	/*
	 * public DemoToBeExtended() { }
	 */

	public DemoToBeExtended(int a, String b) {
		this.a1 = a;
		this.b1 = b;
	}

}
