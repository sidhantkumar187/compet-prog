package ajab_gajab;

import java.io.*;

/*	Given a floor of dimensions 2 x W and tiles of dimensions 2 x 1, the task is to find the 
 * 	number of ways the floor can be tiled. A tile can either be placed horizontally i.e as a 
 *  1 x 2 tile or vertically i.e as 2 x 1 tile.
 * 			
 * 		i.e for 2 x 5 floor Ways are 8
 * 
 * 
 * 		Main Idea:- Find pattern in this question similar to fibonacci sequence
 */

public class FloorTile
 {
	public static void main (String[] args) throws IOException
	 {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 int tc = Integer.parseInt(bf.readLine());
	    
	    while(tc-- >0){
	        
	        int no = Integer.parseInt(bf.readLine());
	        long a = 1, b = 2;      // As ways to floor a 2 x 1 is: 1
	                               // And for           2 X 2 is: 2
	        if (no == 1){
	            System.out.println(1);
	            continue;
	        }
	        else if (no == 2){
	            System.out.println(2);
	            continue;
	        }
	        long ways = 0;
	        for (long i = 3; i <= no; i++){        // ans for    2 x 3 = 2 + 1 = 3 Thus made a pattern
	            ways = a + b;
	            a = b;
	            b = ways;
	        }
	        
	        System.out.println(ways);
	    }
	  bf.close();
	 }
}
