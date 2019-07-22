package gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 *   Kth largest element using Quick_Sort (Divide and conquer) 
 *   
 *   Applying QuickSort on array we get the pivot element's position which gives the accurate pos of that element
 *   and sets the array such that elements on right side of pivot are greater and smaller on left side
 *   
 *   Suppose we got - 4 (Means that this (pivot) element's position is 4. 
 *   And specified we want to know element at 6th position.
 *   
 *   Now we will apply quick sort on the right subarray (as 6th is greater than 4)
 */

public class KthLargest
 {
     public static int partition(int[] arr, int l, int r) 
    { 
        int piv = arr[r], i = l; 
        for (int j = l; j <= r - 1; j++) 
        { 
        	if (arr[j] >= piv) 
        	{ 
        		// Swapping arr[i] and arr[j] 
        		int temp = arr[i]; 
        		arr[i] = arr[j]; 
        		arr[j] = temp; 

        		i++; 
        	} 
        } 
          
        //Swapping arr[i] and arr[r] 
        int temp = arr[i]; 
        arr[i] = arr[r]; 
        arr[r] = temp; 
  
        return i; 
    }
    
    public static int kthLargest(int[] arr, int l,  
                                         int r, int k) 
    { 
        // If k is smaller than number of elements 
        // in array 
        if (k > 0 && k <= r - l + 1) 
        { 
            // Partition the array around last  
            // element and get position of pivot  
            // element in sorted array 
            int pos = partition(arr, l, r); 
  
            // If position is same as k 
            if (pos-l == k-1) 
                return arr[pos]; 
              
            // If position is more, check in left for 
            // left sub-array 
            if (pos-l > k-1)  
                return kthLargest(arr, l, pos-1, k); 
  
            // Else recur for right sub-array 
            return kthLargest(arr, pos+1, r, k-pos+l-1); 
        } 
  
        // If k is more than number of elements 
        // in array 
        return Integer.MAX_VALUE; 
    }
    
     
     
	public static void main (String[] args) throws IOException
	 {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 int tc = Integer.parseInt(bf.readLine());
	    
	    while(tc>0){
	        String str[] = bf.readLine().split(" ");
	        
	        int n = Integer.parseInt(str[0]);
	        int k = Integer.parseInt(str[1]);
	        
	        int arr[] = new int[n];
	        
	        String str1 [] = bf.readLine().split(" ");
	        
	        for (int i = 0; i < n; i++){
	            arr[i] = Integer.parseInt(str1[i]);
	        }
	        
	        System.out.println(kthLargest(arr,0,n-1,k));
	        
	        tc--;
	    }
	  bf.close();
	 }
}
