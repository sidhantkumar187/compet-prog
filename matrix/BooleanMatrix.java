package matrix;

import java.io.*;

/*  Given a boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 (or true) 
 *  then make all the cells of ith row and jth column as 1.
 *  
 *  Input:
	3
	2 2
	1 0
	0 0
	2 3
	0 0 0 
	0 0 1
	
	Output:
	1 1
	1 0
	0 0 1 
	1 1 1
 * 
 */

// Tips:      Try for O(m*n)
//		Just remember Row,Col of the ones. While printing just print the whole row one if that is 1 (remembered),
//      Similarly for Columns

// Note: Don't make change in the original matrix while traversing as it would lead to un-necessary ones.


public class BooleanMatrix
 {
	public static void main (String[] args) throws IOException
	 {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 int tc = Integer.parseInt(bf.readLine());
	    
	    while(tc>0){
	        String str[] = bf.readLine().split(" ");
	        int m = Integer.parseInt(str[0]);
	        int n = Integer.parseInt(str[1]);
	        
	        int arr[][] = new int[m][n];
	        
	        int r[] = new int[m];
	        int c[] = new int[n];
	        
	        for (int i = 0; i < m; i++){
	            String str1[] = bf.readLine().trim().split(" ");
	            for (int j = 0; j < n; j++){
	                arr[i][j] = Integer.parseInt(str1[j]);
	                if (arr[i][j] == 1){
	                    r[i] = 1;
	                    c[j] = 1;
	                }
	            }
	        }
	        
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < m; i++){
	            for (int j = 0; j < n; j++){
	                if (r[i] == 1 || c[j] == 1)
	                    sb.append("1 ");
	                else
	                    sb.append("0 ");
	            }
	            sb.append("\n");
	        }
	        
	        System.out.print(sb);
	        
	        tc--;
	    }
	  bf.close();
	 }
}
