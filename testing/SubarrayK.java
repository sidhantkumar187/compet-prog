package testing;

import java.io.*;
public class SubarrayK
 {
	public static void main (String[] args) throws IOException
	 {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 int tc = Integer.parseInt(bf.readLine());
	    
	    while(tc>0){
	        String str[] = bf.readLine().trim().split(" ");
	        int n = Integer.parseInt(str[0]);
	        long k = Long.parseLong(str[1]);
	        
	        int arr[] = new int[n];
	        
	        String str1 [] = bf.readLine().split(" ");
	        int count = 0;
	        
	        for (int i = 0; i < n; i++){
	            arr[i] = Integer.parseInt(str1[i]);
	            if (arr[i] < k)
	                count++;
	        }
	        
	        if (count<=1){
	            System.out.println(count);
	            tc--;
	            continue;
	        }
	       
	       count = 0;
	        
	        for (int i = 0; i < n; i++){
	            long mul = arr[i];
	            int j = i;
	            while (mul<k && j < n){
	            	mul = mul*arr[j];
	            	if (mul < k)
	            		count++;
	            	j++;
	            }
	        }
	        
	        System.out.println(count);
	        
	        tc--;
	    }
	  bf.close();
	 }
}
