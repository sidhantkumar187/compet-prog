package hackerank;

//import java.util.LinkedList;
import java.util.Scanner;
//import hackerank.LinkedList;

public class LLSparse{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vertexes of Graph(String):");
		String graph = sc.next();
		
		char vertices[] = graph.toCharArray();
		int arr[][] = new int[vertices.length][vertices.length];
		
		for (int i =0;i<arr.length;i++) {
			for (int j = 0;j<arr.length;j++) {
				System.out.println("Weight of vertex: "+vertices[i]+"-"+vertices[j]);
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print("  ");
		for (char ch :vertices)
			System.out.print(" "+ch);
		System.out.println();
		
		for (int i =0;i<arr[0].length;i++) {
			System.out.print(vertices[i]+":");
			for (int j = 0;j<arr[1].length;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
			
		sc.close();
		
		hackerank.LinkedList<Integer> li = new hackerank.LinkedList<>();
		
		for (int i = 0;i<arr[0].length;i++) {
			for (int j = 0;j<arr[1].length;j++) {
				if (arr[i][j] !=0) {
					System.out.println("Inserting:"+arr[i][j]);
					li.insertToSparse(arr[i][j], i, j);
				}
			}
		}
		
		li.showSparse(vertices);
		
	}

}
