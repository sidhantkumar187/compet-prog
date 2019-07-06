package dynamic_prog;

import java.util.Arrays;

public class MinCoinsNeeded {

	public static void main(String[] args) {

		int amount = 17;
		
		int coins[] = {2,5,10};
		
		int sumup[] = new int[amount+1];
		
		Arrays.fill(sumup, Integer.MAX_VALUE);
		sumup[0] = 0;
		
		for (int i = 1; i <= amount; i++) {
			
			for (int j = 0; j+1 < coins.length; j++) {
				int ind1 = i - coins[j];
				int ind2 = i - coins[j+1];
				
				if (ind1>-1 && ind2>-1) {       // If both indexes are valid ( >= 0)
					sumup[i] = Math.min(sumup[i - coins[j]],sumup[i - coins[j+1]]) + 1;
				}
				else if (ind1>-1 || ind2>-1 ) {    // If one of them is valid
					sumup[i] = Math.max(ind1, ind2);
				}
				else {
					sumup[i] = Integer.MAX_VALUE;
				}
			}
		}
		
		System.out.println(sumup[amount]);

	}

}
