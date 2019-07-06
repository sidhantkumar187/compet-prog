package gfg;

import java.util.*;
//import java.lang.*;
import java.io.*;
public class ElementSortArray
 {
    public static Map<Integer,Integer> sortByValue(HashMap<Integer,Integer> hm){
        
        List<Map.Entry<Integer,Integer> > list =     // List is of type `Map.Entry<Integer,Integer>`
            new LinkedList<Map.Entry<Integer,Integer> >(hm.entrySet());
            
        Collections.sort(list, new Comparator<Map.Entry<Integer,Integer> >(){ 
            
            public int compare(Map.Entry<Integer,Integer> a,Map.Entry<Integer,Integer> b){
                
                if (a.getValue() == b.getValue()){     // If the counts are equal than compare Their own key value
                     System.out.println("Inside if for: "+a.getKey()+":"+a.getValue()+" , "+b.getKey()+":"+b.getValue());
                     System.out.println("Returned: "+(a.getKey() > b.getKey() ? -1 : 1));
                    return a.getKey() > b.getKey() ? -1 : 1;
                }
                else{
                     System.out.println("Inside else for: "+a.getKey()+":"+a.getValue()+" , "+b.getKey()+","+b.getValue());
                     System.out.println("Returned: "+(a.getKey()- b.getKey()));
                    return a.getValue()-  b.getValue();
                }
            }
        });
        
        Collections.reverse(list);
        
        HashMap<Integer,Integer> temp = new LinkedHashMap<Integer,Integer>();
        for (Map.Entry<Integer,Integer> ent : list){
            temp.put(ent.getKey(), ent.getValue());
        }
        
        return temp;
    }
     
     
	public static void main (String[] args) throws IOException
	 {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 int tc = Integer.parseInt(bf.readLine());
	    
	    while(tc>0){
	        int size = Integer.parseInt(bf.readLine().replaceAll("\\s",""));
	        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	        
	        String str1 [] = bf.readLine().split(" ");
	        
	        for (int i = 0; i < size; i++){
	            int no = Integer.parseInt(str1[i]);
	            if (hm.containsKey(no)){
	                hm.replace(no,hm.get(no)+1);
	            }
	            else{
	                hm.put(no,1);
	            }
	        }
	        
	        Map<Integer,Integer> sorted = sortByValue(hm);
	        StringBuffer sb = new StringBuffer();
	        
	        for (Map.Entry<Integer,Integer> temp : sorted.entrySet()){
	            for (int i = 0; i < temp.getValue(); i++){
	                sb.append(temp.getKey()+" ");
	            }
	        }
	        
	        System.out.println(sb);
	        
	        tc--;
	    }
	  bf.close();
	 }
}
