package com.blz.loops;

import java.util.Scanner;

public class ForLoop_PowerProgm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		System.out.println("Enter the power");
		int p = sc.nextInt();
		
		int power = 1;
		
		for(int j = 1; j <= p; j++) {
			power = power * num;
		}
		System.out.println("Power is : " +power);
	}
}
