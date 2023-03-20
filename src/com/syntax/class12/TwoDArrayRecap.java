package com.syntax.class12;

public class TwoDArrayRecap {

	public static void main(String[] args) {

		int[][] array = {

				{ 1, 2, 3 }, { 10, 20, 30 }, { 100, 200, 300 } };

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------for each loop"
				+ "---------");

		for (int[] arr : array) {

			for (int arrz : arr) {

				System.out.println(arrz);
			}
			System.out.println();
		}

	}
}