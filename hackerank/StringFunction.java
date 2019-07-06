package hackerank;

public class StringFunction {
	
	static int getFreq(String pat,String raw) {
		int i = 0;
		int freq = 0;
		
		while (i < raw.length()) {
			if (raw.indexOf(pat,i) > -1) {
				System.out.print(i+" ");
				System.out.println("raw.indexOf("+pat+","+i+") = "+raw.indexOf(pat, i));
				freq++;
			}
			i++;
		}
		
		return freq;
	}
	
	public static void main(String[] args) {
		
		String str = "abcdabcdabab";
		
		System.out.println("\n"+getFreq("bc",str));
		
		System.out.println("-----------------------");
		
		System.out.println(str.indexOf("bc"));
		

	}

}
