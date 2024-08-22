package array;

class ConsecutiveSubArray    {

//Function to find the longest subarray
//with increasing contiguous elements
	public static int maxiConsecutiveSubarray(int arr[], int N) {

		// Stores the length of
		// required longest subarray
		int maxi = 0;

		for (int i = 0; i < N - 1; i++) {

			// Stores the length of length of
			// longest such subarray from ith
			// index
			int cnt = 1, j;

			for (j = i; j < N - 1; j++) {

				// If consecutive elements are
				// increasing and differ by 1
				if (arr[j + 1] == arr[j] + 1) {
					cnt++;
				}

				// Otherwise
				else {
					break;
				}
			}

			// Update the longest subarray obtained so far
			maxi = Math.max(maxi, cnt);
			i = j;
		}

		// Return the length obtained
		return maxi;
	}

//Driver Code
	public static void main(String args[]) {
//		int N = 43;
//		int arr[] = { 7,14,18,18,9,12,1,20,11,10,6,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,5,16,2,7,6,16,3,20,11,2,17 };

		int N=5;
		int arr[] = {1,1,1,1,2};
		
		System.out.println(maxiConsecutiveSubarray(arr, N));
	}
}

