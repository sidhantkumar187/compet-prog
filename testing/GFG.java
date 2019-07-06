package testing;

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	
 //	5
//	12 5 787 1 23
//	2
	
	static boolean res = false;
	
     public static void quickSort(int arr[],int start,int end,int k){
         if (start<end){
             int piv_pos = partitionAgent(arr,start,end);
             if (piv_pos == k-1){
            	 res = true;
                 for (int temp:arr){
                     System.out.print(temp+" ");
                 }
                 System.out.println(arr[piv_pos]);
                 return;
             }
             quickSort(arr,start,piv_pos-1,k);
             quickSort(arr,piv_pos+1,end,k);
         }
     }
     
     public static int partitionAgent(int arr[],int start, int end){
         
         int piv = arr[end];
         int i = start - 1;
         
         for (int j = start; j<end; j++){
             if (arr[j] <= piv){
                 i++;
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
         }
         int temp = arr[i+1];
         arr[i+1] = arr[end];
         arr[end] = temp;
         
         return (i+1);
     }
     
     
	public static void main (String[] args) throws IOException
	 {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 int tc = Integer.parseInt(bf.readLine());
	    
	    while(tc>0){
	        // String str[] = bf.readLine().split(" ");
	        int size = Integer.parseInt(bf.readLine().replaceAll("\\s",""));
	        int arr[] = new int[size];
	        
	        System.out.println(size);
	        
	        String str1 [] = bf.readLine().split(" ");
	        
	        for (int i = 0; i < size; i++){
	            arr[i] = Integer.parseInt(str1[i]);
	        }
	        
	        int k = Integer.parseInt(bf.readLine().trim());
	        
	        quickSort(arr,0,arr.length-1,k);
	        
	        if (!res)
	        	System.out.println(arr[k-1]);
	        res = false;
	        
	        tc--;
	    }
	  bf.close();
	 }
}
