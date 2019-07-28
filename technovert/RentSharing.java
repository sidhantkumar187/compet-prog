package technovert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

/* Problem Statement:   Expense Sharing Problem
 * 
 * Give "n" number of person staying together. There are lot of expenses for that group.
 * But at a time only one person pays the whole expense for all. But the expense is divided equally and kept tracked.
 * U need to figure out how much a person "A" has to give to person "B" at every stage.
 * 
 * [  Console Menu would look like: 
	 * Main menu. Press:
	 * 1. for Add expense
	 * 2. for Show expenses
	 * 3. for Exit 
 * ]
 * 
 * Test Case:
 * 3
 * A
 * B
 * C
 * 1. Add expense
 * 2. Show expenses
 * 3. Exit
 * 1
 * A 300
 * 1. Add expense
 * 2. Show expenses
 * 3. Exit
 * 2
 *     A   B   C                                          ~ Main output
 * A   0   0   0
 * B  100  0   0
 * C  100  0   0
 * A 300										~ Expense added
 * 1. Add expense
 * 2. Show expenses
 * 3. Exit
 * 1
 * B 600										~ Expense added
 * 2
 *     A    B    C
 * A   0   100   0
 * B   0    0    0
 * C  100  200   0
 * 3                                             ~ Exit 
 * 
 * ---------------Explanation---------------------------------
 * As "A" gave 300
 * After that "B" and "C" need to give 100 each to "A"
 * 
 * As "B" gave 600
 * The two other now need to give 200 each to "B"
 * But as "A" has paid earlier so "A"'s money owed by "B" would be cutting amount "A" need to pay to "B"
 * 
 * Thus, "A" need to give 100 to "A"
 * and
 * 		"C" need to give 200 to "B" and 100 to "A" as earlier
 */

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