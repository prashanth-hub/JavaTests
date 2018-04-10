package com.Logical;

public class DataStructure {
	public static void main(String[] args) {
		int[] values = { 1, 0, 0, 1, 0, 0, 0, 1, 0, 0 };
		int maxLength = 0;
		int tempLength = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == 0) {
				tempLength++;
			} else {
				tempLength = 0;
			}
			if (tempLength > maxLength) {
				maxLength = tempLength;
			}
		}
		System.out.println("Maximum number of consecutive zeros : " + maxLength);
		
		int countZeros = 0;
		int countOnes = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == 0) {
				countZeros++;
			} else {
				countOnes++;
			}
		}
		System.out.println("Count of zeros is : " + countZeros);
		System.out.println("Count of ones is : " + countOnes);
	}
}