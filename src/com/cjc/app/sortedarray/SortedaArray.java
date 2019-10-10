package com.cjc.app.sortedarray;

public class SortedaArray {
	public static void main(String args[]) {
		int arr1[] = { 2, 3, 7, 8 };
		int arr2[] = { 1,22, 25,55 };
		int n1 = arr1.length;
		int n2 = arr2.length;

		int ass[] = new int[n1 + n2];

		int i = 0;
		int k = 0;
		int j = 0;
		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j])
				ass[k++] = arr1[i++];
			/*
			 * k++; i++;
			 */
			else
				ass[k++] = arr2[j++];

		}
		while (i < n1) {
			ass[k++] = arr1[i++];

		}
		while (j < n2) {
			ass[k++] = arr2[j++];

		}
		for (int x = 0; x < n1 + n2; x++)
			System.out.println(ass[x]);

	}
}
