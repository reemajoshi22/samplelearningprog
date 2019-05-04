package com.oopsConcepts;

public interface Writer {

	void writeObject(TelephoneModel telephoneModel);
	void writeObjectToFile(TelephoneModel telephoneModel,String fileName);
}
