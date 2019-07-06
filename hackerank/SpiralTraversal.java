package hackerank;

//import java.util.Scanner;

/*
* 				----- Spiral Traversal of a 2-D array --------
* 
* 					11 22 33 44
* 					55 66 77 88
* 					12 23 34 75
* 
* 				Spiral Traversal---
* 		
* 					11 22 33 44
* 					88 77 66 55
* 					12 23 34 75
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
		
		
		int row = arr.length;
		int col = arr[1].length;
		
		System.out.println("Rows: "+row+" col: "+col);
		
		for (int i=0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Spiral Traversal: ");
		
		int count = 0;
		int total = 0;
		for(int i = 0; i<row/2; i++) {
			
			int j=0,down=0,left=0,up=0;
			
			for (j = count; j < col-count; j++,total++)
				System.out.println(arr[i][j]);
			j--;
			
			for (down = i+1; down < row-i; down++,total++)				// Going down
				System.out.println(arr[down][j]);
			down--;
			
			for (left = j-1; left >= col-j-1; left--,total++)		// Going left
				System.out.println(arr[down][left]);
			left++;
			
			for (up = down-1; up > i; up--,total++)						// Going up
				System.out.println(arr[up][left]);
			
			count++;
			if(total>=col*row)
				break;
		}
		
		System.out.println("Zig-Zag traversal");
		
		for (int i = 0; i<row; i++) {
		for(int j = 0; j<col; j++) {
			System.out.print(arr[i][j]+" ");
			if (j == col -1 && i < row -1) {			// Whenever print pointer comes to the last column ( j == col - 1) except for last row
				i++;									// Start traversing from end for the next row ( i++ )										
				System.out.println();
				for (int temp = col - 1; temp>=0;temp--) {
					System.out.print(arr[i][temp]+" ");
				}
			}
		}
		System.out.println();
	}
		
	}

}
