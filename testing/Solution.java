package testing;

// ----------------- Not to Study ---------------------------

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
//import java.util.HashSet;
import java.util.Map;
//import java.util.ArrayList;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//import java.util.List;

public class Solution {
	
	static HashSet<String> hs = new HashSet<>();
    static HashMap<Long,Long> hm = new HashMap<>();
    static long lastEntry;

    static void getWaysHelper(long n, long[] c, long spent){
        if (spent == n){
            hs.add(hm.toString());
            // System.out.println("ADDed : "+hm.toString());
            hm.replace(lastEntry,hm.get(lastEntry)-1);
            return;
        }
        else if (spent > n){
            hm.replace(lastEntry,hm.get(lastEntry)-1);
            return;
        }
        
        for (int i = 0; i < c.length; i++){
            lastEntry = c[i];
            if (hm.containsKey(c[i]))
                hm.replace(c[i],hm.get(c[i])+1);
            else
                hm.put(c[i],(long)1);
            getWaysHelper(n,c,spent + c[i]);
        }
        return;
    }
	

    public static void main(String[] args) throws IOException {
        
//    	int arr[] = {19,10,12,24,25,22};    // Total sums 6C2 ~ 15
    	
//    	HashMap<String,Integer> hm = new HashMap<>();
//    	
//    	for (int i = 0; i < arr.length; i++) {
//    		for(int j = i+1; j < arr.length; j++) {
//    			System.out.println(arr[i]+" + "+arr[j]+" = "+(arr[i]+arr[j]));
//    			String a = Integer.toString(arr[i]);
//    			String b = Integer.toString(arr[j]);
//    			hm.put(a+"+"+b, arr[i]+arr[j]);
//    		}
//    	}
//    	
//    	for (Map.Entry<String, Integer> temp : hm.entrySet()) {
//    		System.out.println(temp.getKey()+" : "+temp.getValue());
//    	}
//    	
//    	System.out.println("--------------------------------");
//    	
//    	System.out.println((int)Math.ceil(Math.sqrt(12)));
//    	
//    	System.out.println((int)Math.sqrt(12));
//    	
//    	System.out.println("-------------------------");
    	
//    	Integer test[] = new Integer[5];
    	
//    	HashMap<Integer, Integer> hm1 = new HashMap<>();
//    	HashMap<Integer,Integer> hm2 = new HashMap<>();
//    	
//    	hm1.put(1, 2);
//    	hm1.put(2, 1);
//    	hm2.put(2, 1);
//    	hm2.put(1, 2);
//    	
//    	System.out.println(hm1.toString());
//    	System.out.println(hm2.toString());
//    	
//    	System.out.println(hm1.equals(hm2));
//    	
//    	LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
//    	
//    	hm.put(1,4);
//    	hm.put(2,2);
    	
    	long arr[] = {1,2,3};
    	long n = 4;
    	
//    	System.out.println(getWays(arr,n));
    	
    }
}


