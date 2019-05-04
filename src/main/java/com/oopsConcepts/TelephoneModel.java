package com.oopsConcepts;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TelephoneModel {
	private String brand;
	private String color;
	private ButtonModelClass button;
	public TelephoneModel() {
		super();
	}

	public TelephoneModel(String brand, String color, ButtonModelClass button) {
		super();
		this.brand = brand;
		this.color = color;
		this.button = button;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ButtonModelClass getButton() {
		return button;
	}

	public void setButton(ButtonModelClass button) {
		this.button = button;
	}

}
