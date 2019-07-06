package testing;

import java.util.Arrays;

public class BitonicSubarray {
	
	static int[] increase(int arr[], int i) {
		int results[] = new int[2];
		while(i < arr.length && arr[i] < arr[i+1]) {
			results[0] += arr[i++];
			System.out.println("Adding:"+arr[i-1]);
		}
		results[0] += arr[i];
		results[1] = i;
		return results;
	}
	
	static int[] decrease(int arr[], int i) {
		int results[] = new int[2];
		System.out.println("Inside decrease");
		int last = -1;
		if (i > 0) {
			last = arr[i-1];
		}
		while(i < arr.length && arr[i-1] >arr[i]) {
			results[0] += arr[i++];
		}
		results[0] += arr[i];
		results[1] = i;
		return results;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,3,9};
		
//		System.out.println("Increasing from 4th index: "+Arrays.toString(increase(arr,4)));
		
//		System.out.println("Decreasing from 4th index: "+Arrays.toString(decrease(arr,4)));
		int i = 1;
		int max = Integer.MIN_VALUE;
		int last = arr[0];
		
		while (i < arr.length) {
			
			if (last < arr[i]) {			
				int resultsinc[] = increase(arr,i-1);
				
				int resultsdec[] = decrease(arr,resultsinc[1]+1);
				
				max = Math.max(resultsinc[0]+resultsdec[0], max);
				i = resultsdec[1]+1;
			}
			else {
				int resultsdec[] = decrease(arr,i-1);
				max = Math.max(resultsdec[0],max);
				i = resultsdec[1] + 1;
			}
		}
		
		System.out.println(max);

	}

}
