//Finding Non Repeating elements in an Array

package com.bl.workshop;

public class NonRepeatingNumber {

	static int nonRepeatingNumber(int array[], int number) {
		for (int i = 0; i < number; i++) {
			int j;

			for (j = 0; j < number; j++)
				if (i != j && array[i] == array[j])
					break;
			if (j == number)
				return array[i];
		}
		return -1;
	}

	public static void main(String[] args) {

		int array[] = { 5, 4, 6, 7, 4,5,8 };
		int number = array.length;
		System.out.println(nonRepeatingNumber(array, number));
	}

}
