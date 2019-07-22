package ajab_gajab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Island{
	int x1;
	int y1;
	int x2;
	int y2;
	
	public Island(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
}

public class Warship {
	
	public static int getDistance(int x1, int y1, int x2, int y2) {
		
		return Math.abs(x1-x2) + Math.abs(y1-y2);
	}
	
	public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) 
    { 
        // Create a list from elements of HashMap 
        List<Map.Entry<Integer, Integer> > list = 
               new LinkedList<Map.Entry<Integer, Integer> >(hm.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		List<Island> li = new ArrayList<Island>();
		
		for (int i = 0; i < n; i++) {
			String str[] = bf.readLine().split(" ");
			
			li.add(new Island(Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2]),Integer.parseInt(str[3])));
		}
		
		String str[] = bf.readLine().split(" ");
		int s1 = Integer.parseInt(str[0]);
		int s2 = Integer.parseInt(str[1]);
		int ind = 1;
		HashMap<Integer,Integer> hm = new HashMap<>();
		for (Island i : li) {
			
			int dist = getDistance(s1,s2,i.x1,i.y1);
			dist = Math.min(dist, getDistance(s1,s2,i.x2,i.y2));
			dist = Math.min(dist, getDistance(s1,s2,i.x1,i.y2));
			dist = Math.min(dist, getDistance(s1,s2,i.x2,i.y1));
			
			hm.put(ind++, dist);
		}
		
		hm = sortByValue(hm);
		
		for (Map.Entry<Integer, Integer> ent : hm.entrySet()) {
			System.out.print(ent.getKey()+" ");
		}
		
	}

}
