package com.alancowap.cag.example.demo;

public class Lifeform {
	private int power;
	private int uniqueId;
	private static int count = 0;
	
	Lifeform(int power){
		this.power = power;
		this.uniqueId = count++;
	}
	
	
	@Override
	public String toString(){
		return (this.uniqueId +" "+ this.power);
	}
}
