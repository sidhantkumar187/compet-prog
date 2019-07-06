package backtracking;

/* BACKTRACKING:   (Ref : Notebook (Hare Wali))
 * 					Taking one possible Decision and then further taking decision for next step
 * 				
 * 				If at a step a decision is reaching to end then it is a possiblity(for premutation case)
 *                                      for N-Queen case if we can't make further decision in any step
 *              then backtrack to it's previous step and try it for another possible decision and further 
 *              based on this decision make decision in the next steps
 *              
 *              By steps i mean Row in case of N-Queen problem
 */
/*
 * 										 ("abcd","")
 * 											/
 * 										   /
 * 									    ("bcd","a")           ~Fixing 'a'
 * 									   /	 |     \
 * 									  /	     |		\
 * Already fixed 'a' + now with'b'	("cd","ab") ("bd","ac") ("bc","ad")       
 * 								   /	\
 * 								  /		 \
 * 		Fixing c			("d","abc")   ("c","abd")
 * 								/			\
 * 							   /			 \
 * 						("","abcd")        ("","abdc")
 */


public class PermutationString {
	
	static int count;
	
	public static void permuteHelper(String raw_str, String fixed_str) {
		
		if (raw_str.length() == 0) {
			System.out.println(fixed_str);
			count++;
			return;
		}
		
		for (int i = 0; i < raw_str.length(); i++) {    
			
			char fix = raw_str.charAt(i);				// Fixing the char at 0th, 1th, 2th, .... position incrementally
			
			String rest_string = raw_str.substring(0, i) + raw_str.substring(i+1);     // Exclude that char from raw string
			
			permuteHelper(rest_string,fixed_str+fix);         // Fixing the char along with the previous one
		}
	}
	
	public static void permute(String s) {
		permuteHelper(s,"");
	}

	public static void main(String[] args) {
		
		String str = "abcd";
		
		System.out.println("Calling permute ------------------");
		
		permute(str);
		
		System.out.println("Total permutations must be: "+ utilities.Basic.factorial(str.length())+"\nbut are: "+count);
	}

}
