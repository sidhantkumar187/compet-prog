package hackerank;

//import java.util.Scanner;

/*
* 				----- Spiral Traversal of a 2-D array --------
* 
* 					11 22 33 44
* 					55 66 77 88
* 					12 23 34 75
* 
* 				Zig-Zag Traversal---
* 		
* 					11 22 33 44 88 77 66 55 12 23 34 75
* */
public class SpiralTraversal {

	public static void main(String[] args) {
		
		int arr[][] = {{10,20,30,40},
						{50,60,70,80},
						{90,10,11,12},
						{13,14,15,16},
						{17,18,19,20},
						{21,22,23,24}};
		
//		int arr1[][] = {{1,2,3,4},
//						{5,6,7,8}};
		
		
		int m = arr.length;
		int n = arr[1].length;
		
		System.out.println("Rows: "+m+" col: "+n);
		
		for (int i=0;i<m;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Spiral Traversal: ");
		
		StringBuffer sb = new StringBuffer();
        
        int col_st, row_st, col_end, row_end;
        col_st = 0; row_st = 0; col_end = n; row_end = m;
        
        int total = 0;
        while (total < m*n){
            
            for (int i = col_st; i < col_end && total < m*n; i++){
                sb.append(arr[row_st][i]+" ");
                total++;
            }
                
            for (int j = row_st+1; j < row_end && total < m*n; j++){
                sb.append(arr[j][col_end-1]+" ");
                total++;
            }
                
            for (int k = col_end-2; k > col_st && total < m*n; k--){
                sb.append(arr[row_end-1][k]+" ");
                total++;
            }
            
            for (int l = row_end-1; l > row_st && total < m*n; l--){
                sb.append(arr[l][col_st]+" ");
                total++;
            }
                
                row_st++; col_st++; row_end--; col_end--;
        }
        
        System.out.println(sb);
		
		System.out.println("Zig-Zag traversal");
		
		for (int i = 0; i<m; i++) {
		for(int j = 0; j<n; j++) {
			System.out.print(arr[i][j]+" ");
			if (j == n -1 && i < m -1) {			// Whenever print pointer comes to the last column ( j == col - 1) except for last row
				i++;									// Start traversing from end for the next row ( i++ )										
				System.out.println();
				for (int temp = n - 1; temp>=0;temp--) {
					System.out.print(arr[i][temp]+" ");
				}
			}
		}
		System.out.println();
	}
		
	}

}
