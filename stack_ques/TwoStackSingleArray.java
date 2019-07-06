package stack_ques;

/*	Input:
 * 			2
			6
			1 1 2 1 1 3 2 1 4 1 2 2 2 2 2
			4
			1 1 2 2 2 1 2 2 2
	Output:
	
 * 		3 4 -1
		-1 2 -1
 * 
 * 	Explaination:
 * 			1 1 2    the stack1 will be {2}
			1 1 3    the stack1 will be {2,3}
			2 1 4   the stack2 will be {4}
			1 2      the popped element will be 3 from stack1 and stack1 will be {2}
			2 2      the popped element will be 4 from stack2 and now stack2 is empty
			2 2      the stack2 is now empty hence -1 .
 * 
 * 
 * */

import java.util.*;

class TwoStackSingleArray
{
	
	int size;
	int top1,top2;
	//int arr[] = new int[size];
	int arr[] = new int[100]; 
	
	TwoStackSingleArray()
	{
		int n =100;
		size = n;
		//arr[] = new int[n];
		top1 = -1;
		top2 = size;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		int T = sc.nextInt();
		while(T>0)
		{
			TwoStack sq = new TwoStack();
			
			int Q = sc.nextInt();
			while(Q>0)
			{
				int stack_no = sc.nextInt();
				int QueryType = sc.nextInt();
				
				GfG g = new GfG();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					if(stack_no == 1)
					 g.push1(a,sq);
					else if(stack_no ==2)
					 g.push2(a,sq);
				}else if(QueryType == 2)
				{
					if(stack_no==1)
					System.out.print(g.pop1(sq)+" ");
					else if(stack_no==2)
					System.out.print(g.pop2(sq)+" ");
				}
			
				Q--;
			}
				System.out.println();
		  T--;
		}
	}
}
//This is a function problem.You only need to complete the function given below*/
// Structure of the class is
class TwoStack
{
	int size;
	int top1,top2;
	int arr[] = new int[100];
	TwoStack()
	{
		size = 100;
		top1 = -1;
		top2 = size;
	}
}
class GfG
{
    // sq is the object of class TwoStack
    /* The method push to push element into the stack 2 */
    // static int top1 = -1, top2 = 49;
    void push1(int x, TwoStack sq)
    {
        if (sq.top1 < sq.top2){
            sq.arr[++sq.top1] = x;
        }
    }
    /* The method push to push element into the stack 2*/
    void push2(int x, TwoStack sq)
    {
        if (sq.top2 > sq.top1){
            sq.arr[--sq.top2] = x;
        }
    }
    /* The method pop to pop element from the stack 1 */
    //Return the popped element
    int pop1(TwoStack sq)
    {
        if (sq.top1 < 0){
            return -1;
        }
        return sq.arr[sq.top1--];
    }
    /* The method pop to pop element from the stack 2 */
    //Return the popper element
    int pop2(TwoStack sq)
    {
        if (sq.top2 == sq.size){
            return -1;
        }
        return sq.arr[sq.top2++]; 
    }
}
