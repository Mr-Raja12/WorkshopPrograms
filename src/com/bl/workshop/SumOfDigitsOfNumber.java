package com.bl.workshop;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
	public static void main(String[] args) {

		int m,number,sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		m = scanner.nextInt();

		while (m > 0) {
			number = m % 10;
			sum = sum + number;
			m = m / 10;
		}
		System.out.println("Sum of digits " + sum);

	}

}
