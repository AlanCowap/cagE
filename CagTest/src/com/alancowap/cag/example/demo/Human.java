package com.alancowap.cag.example.demo;

public class Human extends Lifeform {
	private String name;
	
	Human(int power, String name){
		super(power);
		this.name = name;		
	}
	
	@Override
	public String toString(){
		return (super.toString() +" "+ this.name);
	}	
}
