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

/**
 * This game allows various Lifeforms to do simple battle
 * Each Lifeform gets a random power, the lifeform with the highest total power wins
 * 
 * @author Alan Cowap
 *
 */
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
			String robotType ="TypeA";
			if(power >50 ){
				robotType = "TypeB";
			}			
			lives[++i] = new Robot(power, robotType);			
		}
		// Do battle
		int totalHumanPower=0;
		int totalRobotPower=0;
		for(int i=0; i < lives.length-1; ++i){
			totalHumanPower += lives[i].getPower();
			totalRobotPower += lives[++i].getPower();
		}
		if(totalHumanPower > totalRobotPower){
			System.out.println("Humans win: " + totalHumanPower +" vs " + totalRobotPower);
		}else if (totalRobotPower > totalHumanPower){
			System.out.println("Robots win: " + totalRobotPower +" vs "+ totalHumanPower);
		}else{
			System.out.println("It's a draw: " + totalHumanPower +" vs " + totalRobotPower);
		}//
		
	}
	
	/**
	 * Returns a random int value between 0 (inclusive) and maxPower (exclusive)
	 * @param maxPower upper limit (exclusive)
	 * @return random int
	 */
	private int getPower(int maxPower){
		Random r = new Random();
		return r.nextInt(maxPower);
	}

}
