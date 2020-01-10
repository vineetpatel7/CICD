package com.techchefs.demo;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first value : ");
		int first = sc.nextInt();
		System.out.print("Enter second value : ");
		int second = sc.nextInt();

		boolean condition = true;
		while (condition) {
			System.out.println("Enter your choice : ");
			System.out.println("1. Add numbers");
			System.out.println("2. Substract numbers");
			System.out.println("3. Multiply numbers");
			System.out.println("4. For exit");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Add : " + (first + second));
				break;
			case 2:
				System.out.println("Substract : " + (first - second));
				break;
			case 3:
				System.out.println("Multiply : " + (first * second));
				break;
			case 4:
				System.out.println("Thank You");
				condition = false;
				break;
			default:
				System.err.println("Wrong Choice");
			}
		}
	}
}
