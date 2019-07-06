package searching;

public class Search {
//	----------------------------Binary Search using Recursion ----------------------
	public static int binSearch(int[] arr, int x) {
		int pos = -1;
		
		pos = binSearch(arr,x,0,arr.length-1);
		
		return pos;
	}
	
	public static int binSearch(int [] arr, int x, int start, int end) {
		int m = (start+end)/2;
		
		if (start <= end) {
			if (arr[m] == x) {
				System.out.println("True for :"+arr[m]);
				return m+1;
			}
			
			else if (arr[m] > x) {
				 return binSearch(arr,x,start,m-1);
			}
			else{
				 return binSearch(arr,x,m+1,end);
			}
		}
		else
			return -1;
	}
	
//	----------------Binary Search using iterative solution--------------
	
	public static int binarySearch(int[] arr, int x) {
		
		int start = 0, end = arr.length - 1;
		
		while (start <= end) {
			int m = (start + end)/2;
			
			if (arr[m] == x) {
				return m+1;
			}
			else if (arr[m] < x) {
				start = m+1;
			}
			else {
				end = m-1;
			}
		}
		
		return -1;
	}
	
//	----------------------- Binary Search Locating suited position for new element-------------------
	
	public static int binaryLocate(int[] arr, int x) {
		
		int start = 0, end = arr.length - 1;
		
		while(start <= end) {
			int m = (start + end)/2;
			
			if (arr[m] == x) {
				return m+1;
			}
			else if (arr[m] == 2) {
				
			}
		}
		
		return -1;
	}
	
}
