package technovert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondSmallest {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str[] = bf.readLine().split(" ");
		
		int n = str.length;
		
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for (int i = 0; i < n; i++) {
			int elem = Integer.parseInt(str[i]);
			if (elem < first) {
				second = first;
				first = elem;
			}
			else if (elem != first && elem < second) {
				second = elem;
			}
		}
		
		System.out.println(second);

	}

}
