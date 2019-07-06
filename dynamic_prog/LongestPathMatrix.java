package dynamic_prog;

// Longest path is matrix such that consecutive array elements have difference of one only
/*					1 2 9
 * 					5 3 8
 * 					4 6 7
 * 								Longest Path is : 6,7,8,9 (So ,ANS = 4)
 * 
 * */


//import java.util.*;
//import java.lang.*;
import java.io.*;
public class LongestPathMatrix
 {
    public static int find_path(int i , int j, int arr[][], int path[][]){
        int n = arr.length;
        // Base case (Boundary values for i,j as we can't go out of matrix)
        if (i<0 || j<0 || i>n-1 || j>n-1){
            return 0;
        }
        // Check if we calculated solution for subproblem (max path for this point i,j)
        if (path[i][j]!=-1){
            return path[i][j];
        }
        // Check if their sum is 
        if (j>0 && (arr[i][j] - arr[i][j-1] == 1)){
            return path[i][j] = 1 + find_path(i,j-1,arr,path);
        }
        if (i>0 && (arr[i][j] - arr[i-1][j] == 1)){
            return path[i][j] = 1 + find_path(i-1,j,arr,path);
        }
        if (i<n-1 && (arr[i][j] - arr[i+1][j] == 1)){
            return path[i][j] = 1 + find_path(i+1,j,arr,path);
        }
        if (j>n-1 && (arr[i][j] - arr[i][j+1] == 1)){
            return path[i][j] = 1 + find_path(i,j+1,arr,path);
        }
        
        return path[i][j] = 1;   // If there is no case from the above all
        
    }
     
	public static void main (String[] args) throws IOException
	 {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 int tc = Integer.parseInt(bf.readLine());
	    
	    while(tc>0){
	        // String str[] = bf.readLine().split(" ");
	        int n = Integer.parseInt(bf.readLine().replaceAll("\\s",""));
	        int arr[][] = new int[n][n];
	        int path[][] = new int[n][n];
	        
	        String str1 [] = bf.readLine().split(" ");
	        int k = 0;
	        for (int i = 0; i < n; i++){
	            for (int j = 0; j < n; j++){
	                arr[i][j] = Integer.parseInt(str1[k++]);
	                path[i][j] = -1;   // -1 value means path of this point isn't calculated yet
	            }
	        }
	        
	        int max_path = 1;
	        for (int i = 0; i < n; i++){
	            for (int j = 0; j < n; j++){
	                find_path(i,j,arr,path);
	                
	                max_path = Math.max(max_path , path[i][j]);
	            }
	        }
	        
	        System.out.println(max_path);
	        
	        tc--;
	    }
	  bf.close();
	 }
}
