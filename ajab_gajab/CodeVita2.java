package ajab_gajab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CodeVita2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		String str[] = bf.readLine().split(" ");
		
		long bot[] = new long[n];
		
		for (int i = 0; i < n; i++) {
			bot[i] = Long.parseLong(str[i]);
		}
		Arrays.sort(bot);
		Queue<Long> fin = new LinkedList<>();
		fin.add(bot[0]);
		for (int i = 1; i < n; i++) {
			long present = fin.element();
			
			if (bot[i] > present) {
				fin.remove();
			}
			
			fin.add(bot[i]);
		}
		
		System.out.println(fin.size());
	}

}
