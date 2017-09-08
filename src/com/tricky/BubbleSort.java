package com.tricky;


public class BubbleSort {

	public static void main(String[] args) {
		int[] list = sort(new int[]{14, 3, 1, 5, 9, 2});
		for (int i : list){
			System.out.println(i);
		}
	}

	public static int[] sort(int array[]){
		int i = 0;
		boolean hasChanged = false;
		while (i != array.length - 1){
			if (array[i+1] < array[i]){
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
				hasChanged = true;
			}
			
			i++;
		}
		
		if (hasChanged == true){
			sort(array);
		}
		return array;
	}
}
