package com.vitorcamara.projects;

import java.util.Scanner;

public class ClassAgesAverage {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("How many people are in the class?");
		int numberOfPeople = scanner.nextInt();

		double sumOfAges = 0;
		double averageAge = 0;
		double age = 0;

		for (int i = 0; i < numberOfPeople; i++) {
			System.out.println("Enter the age of person " + (i + 1) + ":");
			age = scanner.nextDouble();

			sumOfAges += age;

		}

		averageAge = sumOfAges / numberOfPeople;

		System.out.println("Average age: " + averageAge);

		if (averageAge > 0 && averageAge <= 25) {
			System.out.println("Average age is less than 25 years old: young class.");
		} else if (averageAge >= 26 && averageAge <= 60) {
			System.out.println("Average age is between 26 and 60 years old: adult class.");
		} else if (averageAge > 60) {
			System.out.println("Average age is greater than 60 years old: elderly class.");
		}

	}

}
