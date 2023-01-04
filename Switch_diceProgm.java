package com.blz.loops;

import java.util.Random;

public class Switch_diceProgm {

	public static void main(String[] args) {
		
		Random random = new Random();
		int dice = 1 + random.nextInt(6);
		
		System.out.println("Dice num: " +dice);
		switch(dice) {
		case 1: System.out.println("One");
			break;
			
		case 2: System.out.println("Two");
			break;
			
		case 3: System.out.println("Three");
		break;
		
		case 4: System.out.println("Four");
			break;
			
		case 5: System.out.println("Five");
		break;
		
		default: System.out.println("Six");
		
		}
	}
}
