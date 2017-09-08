package com.tricky;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPairsWhichEqualsSum {

	public static void main(String[] args) {
		int expectedSum = 8;
		List<Integer> noPairs = Arrays.asList(1, 2, 3, 9);
		List<Integer> yesPairs = Arrays.asList(1, 2, 4, 4);
		List<Integer> yesMultiplePairs = Arrays.asList(1, 2, 3, 4, 4, 5);

		System.out.println(checkSum(noPairs, expectedSum));
		System.out.println(storeMatchingPairs(noPairs, expectedSum));
		
		System.out.println(checkSum(yesPairs, expectedSum));
		System.out.println(storeMatchingPairs(yesPairs, expectedSum).size());
		
		System.out.println(checkSum(yesMultiplePairs, expectedSum));
		System.out.println(storeMatchingPairs(yesMultiplePairs, expectedSum));
	}

	// returns at the first hit
	public static boolean checkSum(List<Integer> pairs, int expectedSum) {
		boolean result = false;
		for (int i = 0; i < pairs.size(); i++) {
			for (int j = i + 1; j < pairs.size(); j++) {
				if (pairs.get(i) + pairs.get(j) == expectedSum){
					return true;
				}			
			}
		}
		
		return result;
	}
	
	// save all pairs into a list
	public static List<Integer[]> storeMatchingPairs(List<Integer> pairs, int expectedSum) {
		List<Integer[]> result = new ArrayList<>();;
		for (int i = 0; i < pairs.size(); i++) {
			for (int j = i + 1; j < pairs.size(); j++) {
				if (pairs.get(i) + pairs.get(j) == expectedSum){					
					result.add(new Integer[]{pairs.get(i), pairs.get(j)});
				}			
			}
		}
		
		return result;
	}
}
