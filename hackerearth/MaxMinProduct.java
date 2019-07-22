package hackerearth;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMinProduct {

	public static void main(String[] args) {
		
		int arr[] = {3,7,1,9,4,3,0};
		
		int max_prod = 1;
		boolean zero = false;
		ArrayList<Integer> neg = new ArrayList<Integer>();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max_prod = arr[i] > 0 ? max_prod*arr[i] : max_prod;
			if (arr[i] < 0)
				neg.add(arr[i]);
			else if (arr[i] == 0) {
				zero = true;
			}
		}
		
		Collections.sort(neg);
		// Min product
		if (neg.size()%2==0) {
			for (Integer el : neg)
				max_prod*=el;
		}
		else {
			for (int i = 0; i < neg.size()-1; i++)
				max_prod*=neg.get(0);
		}
		int min_prod = 0;
		
		if (neg.size() > 0) {
			min_prod = 1;
			
			int i = 0;
			for (i = 0; i < neg.size()-1; i++)
				min_prod*=neg.get(0);
			if (neg.size()%2 == 1)
				min_prod*=neg.get(i);
		}
		else {
			// Check for zero
			if (zero) {}
			// if zero not min and there is no negative element
			else {
				min_prod = min;
			}
				
		}
		
		System.out.println("max_prod "+max_prod);
		System.out.println("min_prod "+min_prod);
	}

}
