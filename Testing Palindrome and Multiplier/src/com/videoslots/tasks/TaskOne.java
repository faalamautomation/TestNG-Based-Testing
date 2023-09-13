package com.videoslots.tasks;

import java.util.*;

public class TaskOne {

	public static double[] Multiplier(double[] arr1) {
		int count = 0;

		for (double num : arr1) {
			if (num != 0) {
				if (num % 4 == 0 || num % 6 == 0 || num % 4 == 0 && num % 6 == 0) {
					count++;
				}
			}
		}

		double[] output = new double[count];
		int index = 0;

		for (double n1 : arr1) {
			if (n1 != 0) {

				if (n1 % 4 == 0 || n1 % 6 == 0 || n1 % 4 == 0 && n1 % 6 == 0) {

					output[index] = n1;
					index++;
				}
			}
		}

		System.out.println(Arrays.toString(output));

		return output;
	}

	public static void main(String[] args) {

		Multiplier(new double[] {60,70,80,66,8,48});

	}

}
