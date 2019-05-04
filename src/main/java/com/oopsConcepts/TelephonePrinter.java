package com.oopsConcepts;

public class TelephonePrinter {
	private Writer writer;
	private String fileName;
	
	public TelephonePrinter(Writer writer) {
		this.writer = writer;
	}
	public TelephonePrinter(Writer writer, String fileName) {
		this.writer = writer;
		this.fileName=fileName;
	}
	public void write(TelephoneModel telephoneModel){
		writer.writeObject(telephoneModel);
	}
	public void writeObjectToFile(TelephoneModel telephoneModel,String string){
		writer.writeObjectToFile(telephoneModel, string);
	}
	
}
