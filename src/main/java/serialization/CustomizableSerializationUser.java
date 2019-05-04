package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class CustomizableSerializationUser implements Serializable {
	private static final long serialVersionUID = 7829136421241571165L;

	private String firstName;
	private String lastName;
	private int accountNumber;
	private Date dateOpened;

	public CustomizableSerializationUser(String firstName, String lastName,
			int accountNumber, Date dateOpened) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.dateOpened = dateOpened;
	}

	public CustomizableSerializationUser() {
		super();
	}

	public final String getFirstName() {
		return firstName;
	}

	public final String getLastName() {
		return lastName;
	}

	public final int getAccountNumber() {
		return accountNumber;
	}

	public final Date getDateOpened() {
		return new Date(dateOpened.getTime());
	}

	public final void setFirstName(String aNewFirstName) {
		firstName = aNewFirstName;
	}

	public final void setLastName(String aNewLastName) {
		lastName = aNewLastName;
	}

	public final void setAccountNumber(int aNewAccountNumber) {
		accountNumber = aNewAccountNumber;
	}

	public final void setDateOpened(Date aNewDate) {
		Date newDate = new Date(aNewDate.getTime());
		dateOpened = newDate;
	}

	private void readObject(ObjectInputStream aInputStream) throws IOException,
			ClassNotFoundException {
		firstName = aInputStream.readUTF();
		lastName = aInputStream.readUTF();
		accountNumber = aInputStream.readInt();
		dateOpened = new Date(aInputStream.readLong());

	}

	private void writeObject(ObjectOutputStream aOutputStream)
			throws IOException {
		System.out.println("write");
		aOutputStream.writeUTF(firstName);
		aOutputStream.writeUTF(lastName);
		aOutputStream.writeInt(accountNumber);
		aOutputStream.writeLong(dateOpened.getTime());
	}
}

class SubClass extends CustomizableSerializationUser {
	public int a1;
	public String b1;
}
