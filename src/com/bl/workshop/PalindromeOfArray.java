package com.bl.workshop;

import java.util.Scanner;

public class PalindromeOfArray {

	static boolean pelindrome(int number) {
		int divisor = 1;
		while (number / divisor >= 10)
			divisor = 10;

		while (number != 0) {

			int x = number / divisor;
			int y = number % 10;

			if (x != y)
				return false;
			number = (number % divisor) / 10;
			divisor = divisor / 100;
		}
		return true;
	}

	static int largestPelindrome(int[] array, int number) {
		int res = -1;

		for (int i = 0; i < number; i++) {

			if (array[i] > res && pelindrome(array[i]))
				res = array[i];
		}
		return res;
	}

	public static void main(String[] args) {

		int array[] = { 101, 121, 1234, 23456 };
		int number = array.length;

		System.out.println(largestPelindrome(array, number));

	}
}
