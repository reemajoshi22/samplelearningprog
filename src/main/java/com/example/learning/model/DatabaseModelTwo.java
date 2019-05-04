package com.example.learning.model;

public class DatabaseModelTwo {

	int id;
	String location;
	int pincode;
	DatabaseModel dbModel;


	public DatabaseModel getDbModel() {
		return dbModel;
	}

	public void setDbModel(DatabaseModel dbModel) {
		this.dbModel = dbModel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
