package gfg;

import java.util.*;
//import java.lang.*;
import java.io.*;

// It's just a Sliding window which is being maintained by remembering
// there Start and End index. Sliding window is such that each character
// in sliding window (range) is different and if among them a new distinct
// character comes up then size of sliding window increased.
//
// Sliding window is new if the character is in between it's range

// Sliding window with max size is noted at every step

public class SlidingWindow
 {
	public static void main (String[] args) throws IOException
	 {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 int tc = Integer.parseInt(bf.readLine());
	    
	    while(tc>0){
	        // String str[] = bf.readLine().split(" ");
	        String str = bf.readLine().replaceAll("\\s","");
	        char ch[] = str.toCharArray();
	        int max = 0;
	        int count = 0;
	        int start = 0;
	        int end = 0;
	        HashMap<Character,Integer> hm = new HashMap<>();
	        for (int i = 0; i < ch.length; i++){
	           if (!hm.containsKey(ch[i])){
	               hm.put(ch[i],i);
	               //System.out.println("If Count :"+count+" At :"+i);
	           }
	           else if (hm.get(ch[i]) >= start) {
                   int idx = hm.get(ch[i]);
                   start = idx+1;
	               hm.replace(ch[i],i);
	               //System.out.println("Else-if Count :"+count+" At :"+i);
	           }
	           else{                // Yeah it have char before sliding 
	                                // window so just update the index of char. 
	               hm.replace(ch[i],i);
	               
	               //System.out.println("else Count :"+count+" At :"+i);
	           }
	           end++;
	           count = end - start;
	           max = count > max ? count : max;
	        }
	        
	        System.out.println(max);
	        
	        tc--;
	    }
	  bf.close();
	 }
}
