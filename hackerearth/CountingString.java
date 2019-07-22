package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// Count all the substrings that contain a or z.

/*	Input:                                   Output
 * 	4
	abcd										4
	azazaz										21
	abbzbba										22
	flkjdh										0
 */

/*
 * Another idea is:           O(n)
 * 					No of Substrings having a|z = [Total No. of Substrings] - [No. of Substrings not containing a|z]
 * 
 * Formula for Substring possible for a given N size string is:
 * 
 *  												Subs = (N * (N+1)) / 2
 */

class Counting{
    int a;
    int z;
    
    public Counting(int a, int z){
        this.a = a;
        this.z = z;
    }
}

public class CountingString {
    
    public static boolean isPresent(int i, int j, List<Counting> li){
        
        if (i == 0)
            return (li.get(j).a > 0 || li.get(j).z > 0);
        
        int a = li.get(j).a - li.get(i-1).a;
        int z = li.get(j).z - li.get(i-1).z;
        
        return (a > 0 || z > 0);
    }
    
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().replace("\\s",""));
        
        while (tc-- > 0){
            
            String str = br.readLine();
            
            Counting prev = new Counting(0,0);
            
            List<Counting> li = new ArrayList<Counting>();
            
            long count = 0;
            
            for (int i = 0; i < str.length(); i++){
                
            	Counting temp = new Counting(0,0);
                
                if (str.charAt(i) == 'a'){
                    temp.a = prev.a + 1;
                    temp.z = prev.z;
                    count++;
                }
                else if (str.charAt(i) == 'z'){
                    temp.a = prev.a;
                    temp.z = prev.z + 1;
                    count++;
                }
                else{
                    temp.a = prev.a;
                    temp.z = prev.z;
                }
                prev = temp;
                li.add(temp);
            }
            
            if (count == 0){
                System.out.println("0");
                continue;
            }
            
            for (int i = 0; i < str.length(); i++){
                for (int len = 2; i+len-1 < str.length(); len++){
                    if (isPresent(i,i+len-1,li)){
                        count = count + (str.length()-1) - (i+len-1) + 1;
                        break;
                    }
                }
            }
            
            System.out.println(count);
        }
    }
}

