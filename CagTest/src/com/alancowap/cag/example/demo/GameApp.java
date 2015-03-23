/** 
 * A Game that lets various Lifeforms battle
 * Static members, Inheritance, Overriding, Polymorphism
 * 
 *	 
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */ 

package com.alancowap.cag.example.demo;

import java.util.Random;

public class GameApp {
	private Lifeform[] lives = new Lifeform[1000];
			
	public static void main(String[] args) {		
		new GameApp().runProgram();
	}
	
	private void runProgram(){
		System.out.println("Hello Game World :)");
		for(int i=0; i < lives.length-1; ++i){
			//create humans
			int power = this.getPower(101);
			lives[i] = new Human(power, "John Doe"+i);
			//create robots
			power = this.getPower(101);
			lives[++i] = new Robot(power, "TypeA");
			
		}
		for(int i=0; i < lives.length; ++i){
			System.out.println(lives[i]);
		}
		System.out.println("Random: " + this.getPower(101));
		
	}
	
	/**
	 * 
	 * @param maxPower 
	 * @return 
	 */
	private int getPower(int maxPower){
		Random r = new Random();
		return r.nextInt(maxPower);
	}

}
