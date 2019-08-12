package backtracking;

import java.util.HashSet;

// ColumnWise Solution

class Board {

	int size;
	HashSet<String> placed;
	
	public Board(int size) {
		this.size = size;
		placed = new HashSet<String>();
	}
	
	public boolean isSafe(int row, int col) {
		
		for (int j = col-1; j >= 0; j--) {
			if (placed.contains(row+":"+j))
				return false;
		}
		for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--,j--) {
			if (placed.contains(i+":"+j))
				return false;
		}
		for (int i = row+1, j = col-1; i <= size && j >= 0; i++,j--) {
			if (placed.contains(i+":"+j))
				return false;
		}
		
		return true;
	}
	
	public void place(int row, int col) {
//		System.out.println("placed at "+row+":"+col);
		placed.add(row+":"+col);
	}
	
	public void remove(int row, int col) {
		placed.remove(row+":"+col);
	}
	
	public String toString() {
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (placed.contains(i+":"+j))
					System.out.print("Q ");
				else
					System.out.print("_ ");
			}
			System.out.println();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		return ""; 
	}
}

public class NQueen {
	
	static void solveQueens(Board b) {
		solveQueens(b,0);
	}
	
	private static void solveQueens(Board b,int col) {
		if (col >= b.size) {
			// b.toString();
			// return true;
		}
		
		else {									// Try-out by placing Queen in each cell among a Column
//			System.out.println("Inside else");
			for (int row = 0; row < b.size; row++) {
				
				if(b.isSafe(row, col)) {
					
					// Choose
					b.place(row,col);
					b.toString();
					
					// Explore
					solveQueens(b,col+1);        // Terminate to only one solution make this function return true
												 // if solveQueens(b,col+1) returns to be true
					// Back-Track 
					b.remove(row, col);
				}
			}
		}
		// return false;
	}
	
	public static void main(String[] args) {
		
		Board b = new Board(4);
		
		solveQueens(b);
		
//		System.out.println(b.placed.toString());

	}

}
