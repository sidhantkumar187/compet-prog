package gfg;
// Ref	: https://practice.geeksforgeeks.org/problems/trapping-rain-water/0
// Video ref: https://www.youtube.com/watch?v=Ev5JM6t5oZQ
import java.io.*;
public class TrappingRainWater
 {
	public static void main (String[] args) throws IOException
	 {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 int tc = Integer.parseInt(bf.readLine());
	    
	    while(tc>0){
	        // Take case of: [3,0,0,2,0,4]
	        // Calculating down max height so far from left for each index
	        // Calculating down max height so far from right for each index (populating from left)
	        
	        // Then calculating water for each index by Min(max_left[i],max_right[i]) - height[i]
	        
	        int size = Integer.parseInt(bf.readLine().replaceAll("\\s",""));
	        int arr[] = new int[size];
	        
	        String str1 [] = bf.readLine().split(" ");
	        
	        int max_left[] = new int[size];
	        int max_right[] = new int[size];
	        
	        int max_so_far = 0;
	        for (int i = 0; i < size; i++){
	            arr[i] = Integer.parseInt(str1[i]);
	            max_so_far = max_so_far <= arr[i] ? arr[i] : max_so_far;
	            max_left[i] = max_so_far;
	        }
	        // [3,3,3,3,3,4]    max_from_left
	        
	        max_so_far = 0;
	        for (int i = size-1; i >= 0; i--){
	            max_so_far = max_so_far <= arr[i] ? arr[i] : max_so_far;
	            max_right[i] = max_so_far;
	        }
	        // [4,4,4,4,4,4]    max_from_right
	        
	        long sum = 0;
	        for (int i = 0; i < size; i++){
	            sum += (Math.min(max_left[i],max_right[i]) - arr[i]);
	        }
	        
	        System.out.println(sum);
	        
	        tc--;
	    }
	  bf.close();
	 }
}