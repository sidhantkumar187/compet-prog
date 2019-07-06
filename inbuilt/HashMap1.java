package inbuilt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

// Note: HashMap doesn't maintain any insertion order

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(2, "too");				// putting same key again will change its value to new value
		hm.putIfAbsent(2, "too");
		hm.putIfAbsent(3, "Teen");		// if the key is already present then will not change it's value
		
		//-------------------------------------ITERATING--------------------------------------------
		
		for (Map.Entry<Integer,String> temp:hm.entrySet()) {
			System.out.println(temp.getKey()+": "+temp.getValue());
		}
		
		for (Integer temp:hm.keySet()) {          // returns SET of keys only
			System.out.print(temp+" ");
		}
		System.out.println();
		
		for (String temp : hm.values()) {			// Returns COLLECTION view of values
			System.out.print(temp+" ");	
		}
		System.out.println();
		
		// ----------------------------------Methods -----------------------------------------------
		
		System.out.println(hm.get(1));
		
		System.out.println(hm.remove(1));			// removes and returns the value associated with that key
		
		System.out.println(hm.containsKey(1));		// false
		
		System.out.println(hm.containsValue("too")); // true
		
		System.out.println(hm.size());          
		
		System.out.println(hm.toString());    // Returns original string view of mapped key:values
		
//		hm.clear();
		
//		--------------------------------- Sorting ----------------------------------------------------
		
		// According to Keys____________________
		
		Set<Integer> s = hm.keySet();
		
		List<Integer> li = new ArrayList<>(s); 			// maybe O(n) complexity
		
		Collections.sort(li);
		
		System.out.println(li.toString());
		
		// According to Values___________________
		
		Set<Entry<Integer, String>> en = hm.entrySet();
		
		List<Entry<Integer,String>> temp = new ArrayList<>(en);
		
		Comparator<Entry<Integer,String>> comp = new Comparator<Entry<Integer,String>>(){
			
			@Override
			public int compare(Entry<Integer,String> e1, Entry<Integer,String> e2) {
				return e1.getValue().compareTo(e2.getValue());
			}
		};
		
		Collections.sort(temp,comp);    // Note the Content of List temp is sorted only
		
		System.out.println("After Sorting through EntrySet according to Values:\n"+temp.toString());
		
		// Using TreeMap________________________
		
		TreeMap<Integer, String> tm = new TreeMap<>(hm);    // Will Sort according to keys
		
		System.out.println("Using TreeMap: "+tm.toString());
	}

}
