package technovert;

public class OmitCommon {

	public static void main(String[] args) {
		
		String str1 = "abcde";
		String str2 = "bgha";
		
		String res = str1 + str2;
		
		String res1 = "";
		String res2 = "";
		
		for (int i = 0; i < res.length(); i++) {
			char temp = res.charAt(i);
			
			if (!str2.contains(temp+""))
				res1 += temp;
			if (!str1.contains(temp+""))
				res2 += temp;
		}
		
		System.out.println(res1+" , "+res2);

	}

}
