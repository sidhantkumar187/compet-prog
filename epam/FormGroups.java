package epam;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class FormGroups {
	
	static List<String> res = new ArrayList<String>();
	
	public static List<String> getPerm(String str, List<List<Integer>> li){
		
		if (li.size()== 0) {
			res.add(str);
		}
		else {
			for (Integer el :  li.get(0)) {
				getPerm(str + el,li.subList(1, li.size()));
			}
		}
		
		return res;
	}
	
	public static List<String> getWays(String str,int sum,int range[], List<List<Integer>> li){
		
		if (li.size()== 0) {
			res.add(str);
		}
		else if (sum > range[1]) {}
		else {
			for (Integer el :  li.get(0)) {
				getPerm(str + el,li.subList(1, li.size()));
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		List<List<Integer>> li = new ArrayList<List<Integer>>();
		
		int arr[][] = {{1,2,3},
					   {4,5,6},
					   {7,8,9}};
		
		int range[] = {4,12};
		
		// Manual addition because too much type conversion is needed in java :(
		for (int i = 0; i < arr.length; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			
			for (int j = 0; j < arr[i].length; j++) {
				temp.add(arr[i][j]);
			}
			li.add(temp);
		}
		
		res.clear();
		List<String> ans = getPerm("",li);
		
		System.out.println(ans.toString());
		
	}

}
