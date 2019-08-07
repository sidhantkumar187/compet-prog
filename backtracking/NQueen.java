package backtracking;

import java.util.ArrayList;

class Point{
	int row;
	int col;
}

class Board {

	int size;
	ArrayList<Point> placed;
	
	public Board(int size) {
		this.size = size;
		placed = new ArrayList<Point>();
	}
	
	public boolean isSafe(int row, int col) {
		
		for (int i = col+1; i < size; i++) {
			
		}
		
		return true;
	}
	
	public void place(int row, int col) {
		// code
	}
	
	public void remove(int row, int col) {
		// code
	}
	
	public String toString() {
		return ""; 
	}
}

public class NQueen {
	
	static void solveQueens(Board b) {
		solveQueens(b,0);
	}
	
	static void solveQueens(Board b,int col) {
		if (col >= b.size)
			System.out.println(b.toString());
		
		else {
			for (int row = 0; row < b.size; row++) {
				if(b.isSafe(0, col)) {
					
					// Choose
					b.place(row,col);
					
					// Explore
					solveQueens(b,col+1);
					
					// Un-Choose
					b.remove(row, col);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		

	}

}
