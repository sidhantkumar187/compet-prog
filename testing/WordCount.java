package testing;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str[] = sc.nextLine().split(" ");
		
		System.out.println(str.length);
		
		sc.close();

	}

}
