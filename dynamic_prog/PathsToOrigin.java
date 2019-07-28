package dynamic_prog;

// Paths To Reach Origin (0,0) from given point

import java.util.*;
//import java.lang.*;
import java.io.*;

// Solved using Dynamic Programming (memorization + recursive)

// from a cartesian point we have two ways to move toward origin:
// Either n-1 , m or n , m-1

// Example:

//          3,2
// Either : to    2,2    Or : 3,1
// So we have two paths from this point
public class PathsToOrigin
 {
    static HashMap<String,Integer> hm = new HashMap<>();
    
    public static int find_paths(int n , int m){
        if (n == 0 && m == 0)           // From that point through which this is called we reached to Destination(0,0)
            return 1;              // So return 1 for this path
        if (m < 0 || n < 0)
            return 0;
        String str = Integer.toString(n) + ":" + Integer.toString(m);   // Storing Coordinate point 
        // as String n:m as key in HashMap to store down paths result of this point
        if (hm.containsKey(str)){
            return hm.get(str);         // If we have calculated paths from this point earlier then just return its result
        }                       // through HashMap
        
        hm.put(str,find_paths(n-1,m) + find_paths(n,m-1));
        
        return hm.get(str); 
    }
    
    public static int paths_nodp(int n , int m){
    	
//    	System.out.println("paths_nodp( "+n+" , "+m+")");
    	
        if (n == 0 && m == 0)           // From that point through which this is called we reached to Destination(0,0)
            return 1;              // So return 1 for this path
        if (m < 0 || n < 0)
            return 0;
        
        
        
        return paths_nodp(n-1,m) + paths_nodp(n,m-1); 
    }
     
	public static void main (String[] args) throws IOException
	 {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 int tc = Integer.parseInt(bf.readLine());
	    
	    while(tc>0){
	        String str[] = bf.readLine().split(" ");
	        
	        int n = Integer.parseInt(str[0]);
	        int m = Integer.parseInt(str[1]);
	        
	        float simp = (float)Math.pow(10, 6);
	        
	        hm.clear();
	        long start = System.nanoTime();
	        
	        System.out.println(find_paths(n,m));
	        
	        long end = System.nanoTime();
	        System.out.println("Time using Memorization "+(end - start));
	        System.out.println(hm.toString());
	        
//	-----------------------------------------------------------------
	        start = System.nanoTime();
	        
	        System.out.println(paths_nodp(n,m));
	        
	        end = System.nanoTime();
	        System.out.println("Time without Memo "+(end - start));
	        
	        tc--;
	    }
	  bf.close();
	 }
}