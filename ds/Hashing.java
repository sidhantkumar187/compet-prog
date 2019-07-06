package ds;

import java.util.Hashtable;

/*
 * Hashing has the time complexity of O(n) for :
 * 												insertion
 * 												deletion
 * 												retrieval (access)
 * 
 * It uses hashing(by mode of value or something else) to generate a key for every value using that value. 
 * Comes up with a hashed integer value,
 * small in size. This hashed value is going to be the index of That Element. Thus retrieval can be directly given
 * to the number just by accessing it through it's index no (which is known already)
 * 
 * For more details:-
 * 						https://www.youtube.com/watch?v=KyUTuwz_b7Q
 * */
public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, Integer> h = new Hashtable<>();
		
		h.put(23, 400);

	}

}
