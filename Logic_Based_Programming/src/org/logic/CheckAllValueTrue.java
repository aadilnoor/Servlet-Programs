package org.logic;

public class CheckAllValueTrue {

	public static boolean Check(int[] arr, int key) {

		for (int i = 0; i < arr.length; i = i + 1) {
			if (arr[i] == key) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[] arr = { 5, 1, 1, 9, 7, 2, 6 };
		boolean b = Check(arr, 7);

		System.out.println(b);
	}

}
