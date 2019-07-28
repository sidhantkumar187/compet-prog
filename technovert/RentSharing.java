package technovert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class RentSharing {

	// Assume for case when "A" gave 300. Rest 2 persons will have to contribute 100 each 
	
	public static void addExpense(int exp[][],int ind ,int contribute) {
		
		for (int i = 0; i < exp.length; i++) {
			if (i == ind)					// As "A" has to give himself nothing
				continue;
			if (exp[i][ind] == 0 && exp[ind][i] == 0)
				exp[i][ind] = contribute;	// For case when there is no Len-Den till now
			
			else {
				if (exp[i][ind] != 0)                 
					exp[i][ind] += contribute;		// If "B" already has to give some money then add this one also
				
				else {
					exp[ind][i] -= contribute;      // "B" has to give (Money he had to Give to "A" earlier - How much he contributed Now) to "A"
					if (exp[ind][i] < 0) {
						exp[i][ind] = -exp[ind][i];		// If "A" has to give negative money to "B" then it means 
														// opposite i.e "B" has to give some to "A"
						
						exp[ind][i] = 0;				// This point is most important (There is no money left at one end)
					}
				}
			}
		}
		
	}
	
	public static void showExpenses(int exp[][]) {
		for (int i = 0; i < exp.length; i++)
			System.out.println(Arrays.toString(exp[i]));
	}
	
	public static void main(String[] args) throws IOException{
		
		HashMap<String, Integer> hm = new HashMap<String,Integer>();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		int exp[][] = new int[n][n];
		
		for (int i = 0; i < n; i++)
			hm.put(bf.readLine(), i);
		
		while (true) {
			System.out.println("1. Add Expense\n2. Show Expenses\n3. Exit");
			
			int inp = Integer.parseInt(bf.readLine());
			
			switch(inp) {
				case 1:
					String str[] = bf.readLine().split(" ");
					int contrib = Integer.parseInt(str[1])/n;
					String name = str[0];
					addExpense(exp,hm.get(name),contrib);
					break;
					
				case 2:
					showExpenses(exp);
					break;
					
				case 3:
					return;
					
				default:
					System.out.println("Bad Input");
			}
		}

	}

}

/*
 * 	Running Cases:
 * 	3
	A
	B
	C
	1. Add Expense
	2. Show Expenses
	3. Exit
	1
	A 300
	1. Add Expense
	2. Show Expenses
	3. Exit
	2
	[0, 0, 0]
	[100, 0, 0]
	[100, 0, 0]
	1. Add Expense
	2. Show Expenses
	3. Exit
	1
	B 600
	1. Add Expense
	2. Show Expenses
	3. Exit
	2
	[0, 100, 0]
	[0, 0, 0]
	[100, 200, 0]
	1. Add Expense
	2. Show Expenses
	3. Exit
	1
	C 600
	1. Add Expense
	2. Show Expenses
	3. Exit
	2
	[0, 100, 100]
	[0, 0, 0]
	[0, 0, 0]
	1. Add Expense
	2. Show Expenses
	3. Exit
	1
	A 300
	1. Add Expense
	2. Show Expenses
	3. Exit
	2
	[0, 0, 0]
	[0, 0, 0]
	[0, 0, 0]
	1. Add Expense
	2. Show Expenses
	3. Exit
	3

 * 
 */