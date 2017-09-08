package com.tricky;

// The other solution: saving 1 number and comparing to the others ond by one and save always the smallest
public class FindSmallestListItem {

	public static void main(String[] args) {

		System.out.println(CompareToAllNumbers(new int[] { 2, 3, 1, 9 }));
	}

	// O(n2)
	static int CompareToAllNumbers(int array[]) {
		final int length_of_array = array.length;
		boolean isMin;
		int x;
		for (x = 0; x < length_of_array; x++) {
			isMin = true;

			for (int y = 0; y < length_of_array; y++) {
				if (array[x] > array[y])
					isMin = false;
			}

			if (isMin) {
				break;
			}
		}

		return array[x];
	}
}
