package oop;

class Board {
	int width ,height;
	
	public void setDim(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	public void getDim() {
		System.out.println(width+" "+height);
	}
}

class ThreeDBoard extends Board{
	private int depth;
	
	public void setDim(int height, int width, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public void getDim() {
		System.out.println(width+" "+height+" "+depth);
	}
}

public class MakeBoard {
	public static void main(String[] args) {
		ThreeDBoard b3 = new ThreeDBoard();
		b3.setDim(20, 30, 40);					// This isn't
		b3.getDim();               // This method is over-ridden
	}
}
