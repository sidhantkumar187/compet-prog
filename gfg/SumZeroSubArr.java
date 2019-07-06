package gfg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


// Iterate over array and use HashMap to store sum at each step
// For 0 sum sub-array the sum would repeat as present already in HashSet

//              arr          6 , -1 , -3 , 4 , 6  , -12 , -7
//              sum          6 , 5 ,   2 , 6 , 12 ,  0  , -7

// The number of times is 6 more than 1time corresponds to 0 sum sub-array (total occur - 1)

public class SumZeroSubArr {

	public static void main(String[] args) {
		
		String s = "6 -1 -3 4 -2 2 4 6 -12 -7";
		
		String str[] = s.split(" ");
		int arr[] = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		int sum = 0;
		int count = 0;
		
//		System.out.println(Arrays.toString(arr));
		
		HashMap<Integer,Integer> hm = new HashMap<>(); 
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == 0) {
				count++;
			}
			if (hm.containsKey(sum)) {
				count+=hm.get(sum);
				hm.put(sum, hm.get(sum)+1);
				continue;
			}
			hm.put(sum, 1);          // Even for zero we need to insert as 0 0 case can lead to 3 sub-arrays
		}
		
		System.out.println(count);
	}

}
