package hackerank;

// ----------------- Not to Study ---------------------------

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramSubstring {

    public static void main(String[] args) throws IOException {
        
    	String raw = "ifafi";
    	//            01234
    	int n = raw.length();
    	
    	int ana = 0;
    	
    	int mul[][] = new int[n][26];
    	
    	int count[] = new int[26];
    	
    	for (int i = 0; i < raw.length(); i++) {
    		count[raw.charAt(i) - 'a']++;
    		mul[i] = count.clone();
    	}
    	
    	// Calculating single char anagram
    	for (int i = 0; i < 26; i++) {
    		if (count[i] > 1) {
    			ana += (count[i]*(count[i]-1))/2;       // Formula for calculating pairs possible for element given frequency
    		}											// i.e ((n-1) * n) / 2
    	}
    	
    	System.out.print("\n[");
    	for (int i = 0; i < 26; i++) {
    		System.out.print((char)('a'+i)+", ");
    	}
    	System.out.print("]\n");
    	
    	for (int temp[] : mul) {
    		System.out.println(Arrays.toString(temp));
    	}
    	
    	// Counting anagrams of length greater than 2
    	HashMap<String,Integer> hm = new HashMap<String,Integer>();
    	
    	for (int l = 2; l <= raw.length(); l++) {
    		for (int j = 0; j+l-1 < raw.length(); j++) {
    			String str = "_";
    			if (j == 0)
    				str = getSingleCount(mul[j+l-1]);
    			else
    				str = getCount(mul[j-1],mul[j+l-1]);
    			if (hm.containsKey(str)) {
    				hm.replace(str, hm.get(str)+1);
    			}
    			else {
    				hm.put(str, 1);
    			}
    		}
    	}
    	
    	for (Map.Entry<String, Integer> temp1 : hm.entrySet()) {
    		if (temp1.getValue() > 1) {
//    			System.out.println("ana: "+ (temp.getValue()*temp.getValue()-1)/2+"for- "+temp.getKey());
//    			System.out.println("For Value "+temp.getValue());
    			ana += (temp1.getValue()*(temp1.getValue()-1))/2;
    		}
    	}
    	
    	System.out.println(ana);
    }

    static String getCount(int[] a, int b[]) {
    	
    	String ret = "";
    	
    	for (int i = 0; i < 26; i++) {
    		int count = b[i] - a[i];
    		ret += Integer.toString(count) + (char)(i+'a');
    	}
//    	System.out.println("ret "+ret);
    	return ret;
    }
    static String getSingleCount(int a[]) {
    	String str = "";
    	for(int i = 0; i < 26; i++) {
    		str += Integer.toString(a[i]) + (char)(i+'a');
    	}
//    	System.out.println("str "+str);
    	return str;
    }
}


