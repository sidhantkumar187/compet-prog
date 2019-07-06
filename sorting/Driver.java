package sorting;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		int arr[] = {3,20,1,12,27,2,5,7,4};
		Sort.insertionSort(arr);
		for(int temp:arr) {
			System.out.print(temp+" ");
		}
		System.out.println();
//		----------------------Bubble Sort----------------------
		int arr1[] = {5,4,3,2,1};
		Sort.bubbleSort(arr1);
		System.out.println("After Bubble Sort");
		for(int temp:arr1) {
			System.out.print(temp+" ");
		}
		System.out.println();
//		--------------------Quick Sort-------------------------
		int arr2[] = {3,20,1,12,27,2,5,7,4};
		Sort.quickSort(arr2, 0, arr2.length - 1);
		System.out.println("After Quick Sort");
		for(int temp:arr2) {
			System.out.print(temp+" ");
		}
		System.out.println();
//		--------------------- Selection Sort -------------------
		int arr3[] = {11,55,44,33,22};
		
		System.out.println(Arrays.toString(arr3));
		
		System.out.println(Sort.selectionSort(arr3));
		
		System.out.println(Arrays.toString(arr3));
	}

}
