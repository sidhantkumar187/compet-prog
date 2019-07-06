package gfg;


	// INITIAL CODE
	import java.util.Scanner;
	import java.util.Stack;
	import java.util.HashMap;
	// A Binary Tree node
	class Node
	{
	    int data;
	    Node left, right;
	    Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}
	class LevelOrderSpiral
	{
		
	    // driver function to test the above functions
	    public static void main(String args[])
	    {
			
	        // Input the number of test cases you want to run
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
			//Node root=null;
	        while (t > 0)
	        {
	            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
	            int n = sc.nextInt();
	            Node root=null;
	            while (n > 0)
	            {
	                int n1 = sc.nextInt();
	                int n2 = sc.nextInt();
	                char lr = sc.next().charAt(0);
	                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
	                Node parent = m.get(n1);
	                if (parent == null)
	                {
	                    parent = new Node(n1);
	                    m.put(n1, parent);
	                    if (root == null)
	                        root = parent;
	                }
	                Node child = new Node(n2);
	                if (lr == 'L')
	                    parent.left = child;
	                else
	                    parent.right = child;
	                m.put(n2, child);
	                n--;
	            }
			
	            Spiral g = new Spiral();
	            g.printSpiral(root);
				System.out.println();
	            t--;
				
	        }
	    }
	}
	/*This is a function problem.You only need to complete the function given below*/
	/*
	// A Binary Tree node
	class Node
	{
	    int data;
	    Node left, right;
	    Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}
	*/
	class Spiral
	{
	      void printSpiral(Node node) 
	      {
	          StringBuffer sb = new StringBuffer();
	           Stack<Node> s1 = new Stack<>();
	           Stack<Node> s2 = new Stack<>();
	           
	           s1.push(node);
	           
	           while (!s1.empty() || !s2.empty()){
	               
	               while(!s1.empty()){
	                   Node temp = s1.pop();
	                   sb.append(temp.data+" ");
	                   if (temp.right!=null){
	                       s2.push(temp.right);
	                   }
	                   if (temp.left!=null){
	                       s2.push(temp.left);
	                   }
	               }
	               while(!s2.empty()){
	                   Node temp = s2.pop();
	                   sb.append(temp.data + " ");
	                   if (temp.left!=null){
	                       s1.push(temp.left);
	                   }
	                   if (temp.right!=null){
	                       s1.push(temp.right);
	                   }
	               }
	           }
	           
	           System.out.print(sb);
	           
	      }
	}
