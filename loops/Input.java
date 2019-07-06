package loops;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		System.out.println("No. of Test Cases: ");
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		List<int[]> li = new ArrayList<>();
		
		while (cases>0) {
		
			int size = sc.nextInt();
			int temp[] = new int[size];
			
			for (int i = 0; i<size;i++) {
				temp[i] = sc.nextInt();
			}
			
			li.add(temp);
			cases--;
		}
		Iterator<int[]> itr = li.iterator();
		while (itr.hasNext()) {
			for (int arr:itr.next()) {
				System.out.print(arr+"\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
