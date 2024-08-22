package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSum {
	public static List<int[]> pairSum(int[] arr, int s) {
		// Write your code here.
		List<int[]> list = new ArrayList<>();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == s) {
					int[] pair = new int[2];
					pair[0] = arr[i];
					pair[1] = arr[j];
					list.add(pair);

				}
			}
		}
		return list;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		List<int[]> result = pairSum(arr, 5);
		for(int[] elementpair : result) {
			System.out.println(Arrays.toString(elementpair));
		}
	}

}
