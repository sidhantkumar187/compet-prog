package sorting;
// Reference Geeks For Geeks video
public class Sort {
//	-------------------------------INSERTION SORT ------------------------------------------------------
	
	/* Leftmost element of the Array is considered to be sorted and it is.
	 * 
	 * From the remaining ones leftmost number is taken out
	 * i.e { 2 } say it Key Element . Hence it's best position is found out in the Left sub-part.
	 * 
	 * 
	 * {5, 3, 4, 7, 2, 8, 6, 9, 1}
	 * 
	 * leftmost - 5 fully sorted
	 * 
	 * leftmost of the remaining array is - 3 (as Key Element
	 * )
	 * And then Key is compared to the left part (Sorted)
	 * 
	 * 		If the left no. is larger than its swapped with that one
	 * 
	 * */
	static void insertionSort(int arr[]) {
		
		int key,j;
		
		// i = 1 in 1st step bcoz left-most part is sorted.
		for (int i = 1; i<arr.length; i++) {
			
			key = arr[i];
			j = i - 1;	// i - 1 bcoz key is i'th. So must be compared going leftwards towards the head of array
						// comparing KEY.
			
			while(j >=0 && arr[j] > key) {
				arr[j+1] = arr[j];			// Shifting the left-part elements to the right if found to be Greater than Key Selected.
				j = j - 1;
			}
			arr[j+1] = key;
		}
	}
//	----------------------------------------BUBBLE SORT----------------------------------------
	
	static void bubbleSort (int arr[]) {
		for (int i = 0; i<arr.length;i++) {
			for (int j = 0; j < i-1-j; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
//	---------------------------------------QUICK SORT-----------------------------------
//	Time Complexity:           Worst: n^2       ,   Best: nlog(n)
	
	/*							Ref = Green Notebook (ADA)
	 * Quick Sort is a Divide and Conquer Approach
	 * Pivot is selected from the right end and all the elements present in the array are adjusted such that-
	 * 		Smaller Than Pivot are shifted to the left of Pivot
	 * 		Greater than Pivot are shifted to the Right of Pivot
	 * Then the position of pivot is noted [Note:This is the exact postition of the pivot element in Sorted array]
	 * Quick Sort is then applied to the Left Sub-Part as well as Right Sub-Part
	 * */
	public static void quickSort(int arr[],int start,int end){
		
		if (start < end) {
			int piv_pos = partitionAgent(arr,start,end);
			quickSort(arr,start,piv_pos-1);						// Hence position of pivot is set so no need to pass piv for Quick Sort now.
			quickSort(arr,piv_pos+1,end);						// ________________________________________________________________________
		}
	}
	// This is the Partition agent cum shifter
	// It always shifts the Smaller Elements to Left and Greater to Right, Pivot to exact position (pivot picked from right end)
	static int partitionAgent(int arr[],int start, int end) {
		
		int piv = arr[end];
		int i = start -1;                     // i = -1 (for base case)        ~only when start is 0
		int j;
		
		for (j = start; j <= end-1; j++) {
			
			if (arr[j] <= piv) {
				
				i++;
				
				int temp = arr[j];		// Swapping
				arr[j] = arr[i];
				arr[i] = temp;
				
			}
		}
		int temp = arr[i+1];	// Moving pivot to it's exact position as upto (i) all the elements smaller than pivot
		arr[i+1] = arr[end];
		arr[end] = temp;
		System.out.println("Pivot: "+piv+" It's position: "+(i+1));
		return (i+1);		// Returning the position of pivot element as pivot is now at i+1 & at its real position in whole array
	}
	
	/*
	 * -----------------------------------------------------------------------------------------------------------------
	 * _________________________________________________________________________________________________________________
	 * 
	 * 												Selection Sort
	 * 
	 * Repeatedly find the minimum element from unsorted part and putting it at beginning. Maintains two sub-arrays
	 * : One is sorted(Left sub-array) while right is untouched unsorted
	 * 
	 *  Application : Can be use to find minimum number of swaps needed to sort the array.
	 *  
	 *  Because it looks for the minimum element from unsorted part and puts it into leftmost part
	 */
	
	
	public static int selectionSort(int arr[]) {
		int swaps = 0;
		
		for (int i = 0; i < arr.length-1; i++) {
			int min_index = i;						// 
			
			int f = 0;
			for (int j = i+1; j < arr.length; j++) {      // Look for minimum element in the right sub-array
				if (arr[j] < arr[min_index]) {
					min_index = j;
					f++;
				}
			}
			// Swap the minimum to desired leftmost location
			if (f > 0) {
				int temp = arr[i];
				arr[i] = arr[min_index];
				arr[min_index] = temp;
				swaps++;
			}
		}
		return swaps;
	}
	
}
