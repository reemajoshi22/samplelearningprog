package com.oopsConcepts;

public class ProgramLauncher {
	public static void main(String[] args) {
		TelephoneModel model = new TelephoneModel();
		model.setBrand("beetel");
		model.setColor("white");
		ButtonModelClass button = new ButtonModelClass();
		button.setLabels("1");
		model.setButton(button);
	/*	TelephonePrinter telepphonePrinter1 = new TelephonePrinter(new XmlWriter());
		TelephonePrinter telepphonePrinter2 = new TelephonePrinter(new JsonWriter());*/
		TelephonePrinter telepphonePrinter1 = new TelephonePrinter(new XmlWriter(),"ProgramLauncher");
		TelephonePrinter telepphonePrinter2 = new TelephonePrinter(new JsonWriter(),"ProgramLauncher");
	/*	telepphonePrinter1.write(model);
		telepphonePrinter2.write(model);*/
		telepphonePrinter1.writeObjectToFile(model, "ProgramLauncher");
		telepphonePrinter2.writeObjectToFile(model, "ProgramLauncher");
		/*Writer writer=new XmlWriter();
		writer.writeObject(model);
		
		writer=new JsonWriter();
		writer.writeObject(model);*/
	}
}
