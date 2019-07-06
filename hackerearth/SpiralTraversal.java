package hackerearth;

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
		
		int rowt = row;
		int colt = col;
		for(int i = row - rowt;i<rowt;i++) {
			for (int j = col - colt;j<colt;j++) {
				System.out.print(arr[i][j]+" ");
				if (j == colt-1 && i < rowt-1) {
					System.out.println();
					for (int down = i+1;down<rowt;down++) {				// Going down
						System.out.print(arr[down][j]+" ");
						if (down == rowt-1) {
							System.out.println();
							for (int left = colt-2; left >= col-colt; left--) {		// Going left
								System.out.print(arr[rowt-1][left]+" ");
								if (left == col-colt) {						// Going Upward
									System.out.println();
									for(int up = rowt - 2; up>row-rowt;up--) {
										System.out.print(arr[up][left]+" ");
									}
								System.out.println();
								}
							}
						}
					}
					rowt--;colt--;
				}
			}
		}
		
//		for (int i = 0; i<row; i++) {
//		for(int j = 0; j<col; j++) {
//			System.out.print(arr[i][j]+" ");
//			if (j == col -1 && i < row -1) {			// Whenever print pointer comes to the last column ( j == col - 1) except for last row
//				i++;									// Start traversing from end for the next row ( i++ )										
//				System.out.println();
//				for (int temp = col - 1; temp>=0;temp--) {
//					System.out.print(arr[i][temp]+" ");
//				}
//			}
//		}
//		System.out.println();
//	}
		
	}

}
