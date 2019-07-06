package gfg;

/*
 * 			calculate min possible no of operations to get the desired number from zero:
 * 			
 * 			Given :- We can do Incremental operation , Doubling Operation
 * 
 * 			Ex-  no = 20 ~~ operations =  1, 2, 4, 5, 10, 20 i.e 6
 * */


import java.io.*;

public class MinOperation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int no = Integer.parseInt(bf.readLine());
		
		int op = 1;
		while (no>1) {
			if (no%2==0 && no!=1)
			{
				op++;
			}
			else {
				op+=2;
			}
			no = no / 2;
		}
		System.out.println(op);

	}

}
