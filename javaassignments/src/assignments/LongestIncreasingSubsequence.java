package assignments;

public class LongestIncreasingSubsequence {
	
		public static int LongestIncreasingSubsequence(int[] arr, int i, int n, int prev)
	    {
	        // Base case: nothing is remaining
	        if (i == n) {
	            return 0;
	        }
	 
	        // case 1: exclude the current element and process the
	        // remaining elements
	        int excl = LongestIncreasingSubsequence(arr, i + 1, n, prev);
	 
	        // case 2: include the current element if it is greater
	        // than the previous element in LIS
	        int incl = 0;
	        if (arr[i] > prev) {
	            incl = 1 + LongestIncreasingSubsequence(arr, i + 1, n, arr[i]);
	        }
	 
	        // return the maximum of the above two choices
	        return Integer.max(incl, excl);
	    }
	 
	    public static void main(String[] args)
	    {
	        int[] arr = { 1, 2, 3, 11, 3, 12, 5, 13, 1, 8, 4, 12, 2, 10, 6, 14 };
	 
	        System.out.print("The length of the Longest Increasing Subsequence is "
	                        + LongestIncreasingSubsequence(arr, 0, arr.length, Integer.MIN_VALUE));
	    }
	}


