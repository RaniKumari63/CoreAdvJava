package com.assignment2;

public class Practice1 {
	static String getOddCount(int[] arr) {
		String val = null;
		int count = 0;
		int oddcount = 0;
		int len = 0;
		if (arr != null) {
			len = arr.length;
		}

		if (len == 5) {

			val = "1";
		}

		if (arr == null) {
			val = "-4";
		} else if (len == 5) {

			for (int i = 0; i < len; i++) {

				if (arr[i] <= 0) {
					val = "-2";
				} else if (arr[i] % 2 == 0) {
					count++;
				} else if (arr[i] % 2 != 0) {
					oddcount++;
					val = oddcount + " ";

				}
				if (count == len) {
					val = "-3";

				}

			}
		}

		else {
			val = "-1";
		}

		return val;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,2,3,4,5};
		String str = getOddCount(arr);
		System.out.println(str);

	}

}
