package com.oopsConcepts;

import java.util.Scanner;

public class EmployeePrinter {
	protected static final String EXTENSION=null ;
	private String fileExtension;
	private Scanner scanner;
	public static void main(String[] args) {
		EmployeePrinter employeePrinter=new EmployeePrinter();
		Employee employee = new Employee();
		employee.setAge(22);
		employee.setDept("uidai");
		employee.setEmp_id(11012400);
		employee.setGender("F");
		employee.setName("Reema Joshi");
		employeePrinter.print(employee,EXTENSION);
	}
	private void print(Employee employee, String extension) {
		scanner = new Scanner(System.in);
		System.out.println("Choose output format \n"
				+ "1. Xml  \n"
				+ "2. json");
		fileExtension = scanner.nextLine();
		if(fileExtension.equalsIgnoreCase("xml")){
			XmlWriter writer=new XmlWriter();
			writer.printInXmlFile(employee);
		}
		 if(fileExtension.equalsIgnoreCase("json")){
			JsonWriter writer=new JsonWriter();
			writer.printInJsonFile(employee);
		}
		
	}

}
