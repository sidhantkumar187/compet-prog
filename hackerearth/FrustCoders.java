package hackerearth;

import java.util.Arrays;

public class FrustCoders {

	public static void main(String[] args) {
		int arr[] = {3,5,8,4,3};
		int kill_count[] = new int[arr.length];
		Arrays.sort(arr);
		for (int i =0;i<arr.length;i++) {
			kill_count[i] = 1;
		}
		for (int i = 0;i<arr.length;i++) {
			
			for (int j = i;j<arr.length-1;j++) {
				if (arr[j+1] > arr[i] && kill_count[j+1]==1) {
					System.out.println(arr[j]+" Ko Thoka: "+arr[j+1]+"ne");
					arr[i] = 0;
					kill_count[j+1]--;
					break;
				}
			}
		}
		int sum = 0;
		for (int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum :"+sum);
	}

}
