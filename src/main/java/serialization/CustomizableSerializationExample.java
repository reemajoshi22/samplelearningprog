package serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class CustomizableSerializationExample {
	public static void main(String[] args) {
		CustomizableSerializationUser customizableSerializationUser=new CustomizableSerializationUser("reema","joshi",123456,new Date());
		try {
			FileOutputStream fileOutputStream=new FileOutputStream(new File("E:\\customserialization.ser"));
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(customizableSerializationUser);
			fileOutputStream.close();
			objectOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
