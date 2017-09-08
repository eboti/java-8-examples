package com.basics;

import java.util.ArrayList;
import java.util.List;

public class MatrixSpiralIteration {

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3, 4},
				{6, 5},
				{7}
		};
		
		List<Integer> list = new MatrixSpiralIteration().iterateMatrix(matrix);
		System.out.println(list);
	}

	public List<Integer> iterateMatrix(int[][] matrix){
		List<Integer> result = new ArrayList<>();
		
		int rowNum = matrix.length; // rowNum = 3

		for (int i = 0; i < matrix.length; i++){
			if (i % 2 == 0){
				for (int j = 0; j < matrix[i].length; j++){
					result.add(matrix[i][j]);
				}
			}else{
				for (int j = matrix[i].length - 1; j >= 0; j--){
					result.add(matrix[i][j]);
				}				
			}
		}
		
		return result;
	}
}
