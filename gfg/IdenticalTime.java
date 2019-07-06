package gfg;

// Count number of times identical time came in between give time range(of a Digital Clock)

// Given Hours and Minutes (Two digit number only)
/*
 * 				hrs : 24
 * 				min : 60
 * 
 *          So the identical times will be:
			Single digit hours and single digit minutes -> 0:0, 1:1, 2:2, …., 9:9
			Single digit hours and double digit minutes -> 1:11, 2:22, 3:33, 4:44 and 5:55
			Double digit hours and single digit minutes -> 11:1 and 22:2
			Double digit hours and double digit minutes -> 11:11, 22:22
 */

public class IdenticalTime {

	public static void main(String[] args) {
		
		int hrs = 34;
		int min = 50;
		
		//Solution Divided into two parts:
		
		// 1. Given Hours in One Digit number:
		int count = 1;
		for (int i = 1; i <= 9 && i < hrs; i++) {
			// check for 1:1
			if (i < min)
				count++;
			// Check for 1:11
			if (i < (10*i + i) && (10*i + i) <= min)
				count++;
		}
		
		// 2. Given Hours in Two digit number
		for (int i = 1; i <= 9 && i < hrs; i++) {
			// check for 11:1
			if ((i*10 + i) < hrs && i < min)
				count++;
			// Check for 11:11
			if ((i*10 + i) < hrs && (i*10+i) < min)
				count++;
		}
		
		System.out.println("For hours:"+hrs+" minutes: "+min);
		System.out.println(count);

	}

}
