package com.oopsConcepts;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonWriter implements Writer{
	public void printInJsonFile(Employee employee){
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("E:\\jsonWriter.json"), employee);
			System.out.println("json file written to E:\\jsonWriter.json");
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeObject(TelephoneModel telephoneModel) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File("E:\\jsonWriter.json"), telephoneModel);
			System.out.println("json file written to E:\\telephoneModel.json");
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeObjectToFile(TelephoneModel telephoneModel, String fileName) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File(fileName), telephoneModel);
			System.out.println("json file written to E:\\telephoneModel.json");
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
