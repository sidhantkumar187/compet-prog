package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

/*												TREE
	  										([a,b,c,d] , [])
	  										/			   \
	  									   /			    \
	  							([b,c,d] , [a])     	 ([b,c,d] , [])
	  							/			\				/		\
	  					([c,d],[a,b])   ([c,d],[a])	  ([c,d],[b])   ([c,d] , [])
	  					/			  \
	 				   /			   \
	  		([d],[a,b,c])	  		([d],[a,b])
	  		/			\			/		\
 ([],[a,b,c,d])  ([],[a,b,c])  	([],[a,b,d])  ([],[a,b])	
 
  								
 */

public class Sublists {
	
	public static void sub(ArrayList<String> arr) {
		ArrayList<String> chosen = new ArrayList<>();
		sub(arr,chosen);
	}
	public static void sub(ArrayList<String> arr, ArrayList<String> chosen) {
//		System.out.println("sub("+arr.toString()+" , "+chosen.toString()+")");
		if (arr.size()==0) {
			System.out.println("...........\t"+chosen.toString());
		}
		else {
			String first = arr.get(0);			// Making Choose/unChoose on first element
			arr.remove(0);
			
			chosen.add(first);					// With first element (INCLUDE)
			sub(arr,chosen);
			
			chosen.remove(chosen.size()-1);		// Without first element chosen (EXCLUDE)
			sub(arr,chosen);
			
			arr.add(0, first);					// unChoose
		}
	}
	
	public static void main(String[] args) {
		
		String arr[] = {"a","b","c","d"};
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
		
		sub(list);

	}

}
