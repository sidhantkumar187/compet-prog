package ajab_gajab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class CodeVita {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		String str = bf.readLine();
		
		int q[] = new int[Integer.parseInt(bf.readLine())];
		
		for (int i = 0; i < q.length; i++) {
			q[i] = Integer.parseInt(bf.readLine());
		}
		
		List<HashMap<Character,Integer>> li = new ArrayList<HashMap<Character,Integer>>();
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			
			if (hm.containsKey(str.charAt(i))) {
				hm.replace(str.charAt(i), hm.get(str.charAt(i))+1);
			}
			else {
				hm.put(str.charAt(i), 1);
			}
			@SuppressWarnings("unchecked")
			HashMap<Character,Integer> temp = (HashMap<Character,Integer>)hm.clone();
			li.add(temp);
		}
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < q.length; i++) {
			int temp = q[i];
			char ch = str.charAt(temp-1);
			
			if (temp == 1) {
				sb.append("0\n");
			}
			else {
				if (li.get(temp-2).containsKey(ch)) {
					sb.append(li.get(temp-2).get(ch)+"\n");
				}
				else {
					sb.append("0\n");
				}
			}
		}
		
		System.out.println(sb);

	}

}
