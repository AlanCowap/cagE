package com.alancowap.cag.example.demo;

public class Robot extends Lifeform {

	private String modelName;
	
	public Robot(int power, String modelName) {
		super(power);
		this.modelName = modelName;
	}

	@Override
	public String toString(){
		return (super.toString() +" "+ this.modelName);
	}	

}
