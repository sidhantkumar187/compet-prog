package colection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class HMap {

	public static void main(String[] args) {
		
		int arr[] = {1,1,2,4,123,123,4,9,8,9,8};
		
		System.out.println(Arrays.toString(arr));
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for (int temp : arr) {
			if (hm.containsKey(temp))
				hm.replace(temp, hm.get(temp)+1);
			else
				hm.put(temp, 1);
		}
		
		List<Entry<Integer, Integer> > list = 
				new LinkedList<Entry<Integer, Integer> >(hm.entrySet());
		
		list.sort(Comparator.comparingInt(Entry::getValue));        // shortcut for Ascending order only
		
		LinkedHashMap<Integer,Integer> lhm = new LinkedHashMap<>();
		
		for(Entry<Integer, Integer> temp : list) {
			lhm.put(temp.getKey(), temp.getValue());
		}
		
		System.out.println(lhm.toString());

	}

}
