package com.oopsConcepts;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
public class XmlWriter implements Writer {
	
	public void printInXmlFile(Employee employee){
		try {
			JAXBContext jContext = JAXBContext.newInstance(Employee.class);
			Marshaller jaxbMarshaller = jContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(employee, new File("E:\\xmlWriter.xml"));
			System.out.println("xml file written to E:\\xmlWriter.xml");
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	public void writeObject(TelephoneModel telephoneModel) {
		try {
			JAXBContext jContext = JAXBContext.newInstance(TelephoneModel.class);
			Marshaller jaxbMarshaller = jContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(telephoneModel, new File("E:\\telephoneModel.xml"));
			System.out.println("xml file written to E:\\xmlWriter.xml");
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}


	public void writeObjectToFile(TelephoneModel telephoneModel, String fileName) {
		try {
			JAXBContext jContext = JAXBContext.newInstance(TelephoneModel.class);
			Marshaller jaxbMarshaller = jContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(telephoneModel, new File(fileName));
			System.out.println("xml file written to E:\\xmlWriter.xml");
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}

}
