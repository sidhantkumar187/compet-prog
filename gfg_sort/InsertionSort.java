package gfg_sort;

import java.util.Arrays;

public class InsertionSort {
	
	public static void sort(int arr[]) {
		
		// Leftmost part of the Array will remain sorted 
		
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];					// Making present element as key and storing it into key variable
			int j = i-1;				// Index of the rightest element of the Sorted array at Left.
			
			while(j >= 0 && arr[j] > key) {    // Move one index forward the elements if larger than key
				arr[j+1] = arr[j];
				arr[j] = key;
				j--;
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = {3,4,2,6,9,10,7,13,1};
		
		sort(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}
