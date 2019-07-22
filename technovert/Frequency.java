package technovert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Frequency {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		String li[] = bf.readLine().split(" ");
		
		int q = Integer.parseInt(bf.readLine());
		
		String quer[] = bf.readLine().split(" ");
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>(); 
		
		for (int i = 0; i < n; i++) {
			if (hm.containsKey(li[i])) {
				hm.replace(li[i], hm.get(li[i])+1);
			}
			else {
				hm.put(li[i],1);
			}
		}
		
		for (int i = 0; i < q-1; i++) {
			if (hm.containsKey(quer[i])) {
				System.out.print(hm.get(quer[i])+",");
			}
			else {
				System.out.print("0,");
			}
		}
		// Last one to avoid (,) at end
		
		if (hm.containsKey(quer[q-1])) {
			System.out.print(hm.get(quer[q-1])+",");
		}
		else {
			System.out.print("0,");
		}
		
	}

}
