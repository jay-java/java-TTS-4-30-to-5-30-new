package core;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		// 1.simple if
		int i, j;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		i = sc.nextInt();
		System.out.println("enter j = ");
		j = sc.nextInt();
		if (i > j) {
			System.out.println("i is greater than j");
		}

		// 2.if else
		if (i > j) {
			System.out.println("i is greater than j");
		} else {
			System.out.println("j is greater than i");
		}

		// 3.nested if
		int age;
		System.out.println("enter age : ");
		age = sc.nextInt();
		if (age > 18) {
			if (age < 60) {
				System.out.println("you are eligible");
			} else {
				System.out.println("age is greatert than 18 but not less than 60");
			}
		} else {
			System.out.println("age is less than 18");
		}

		// 4.else if ladder
		int marks;
		System.out.println("entet marks : ");
		marks = sc.nextInt();
		if (marks < 35) {
			System.out.println("fail");
		} else if (marks >= 35 && marks <= 50) {
			System.out.println("pass class");
		} else if (marks >= 51 && marks <= 70) {
			System.out.println("C class");
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("B class");
		} else if (marks >= 81 && marks <= 90) {
			System.out.println("A class");
		} else if (marks >= 91 && marks <= 100) {
			System.out.println("A+ class");
		} else {
			System.out.println("invalid input");
		}

		// 5.switch case
		int c;
		System.out.println("enter your choice : ");
		System.out.println("Press 1 for English");
		System.out.println("Press 2 for HIndi");
		System.out.println("Press 3 for Gujarati");
		c = sc.nextInt();
		switch (c) {
		case 1:
			System.out.println("you selected english");
			break;
		case 2:
			System.out.println("you selected hindi");
			break;
		case 3:
			System.out.println("you selected gujarati");
			break;
		default:
			System.out.println("invalid input");
		}
	}
}
