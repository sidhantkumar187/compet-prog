package gfg;

public class MakePalind {
	
	public static String reverse(String str) {
		
		char ch[] = str.toCharArray();
		
		int right = ch.length - 1; 
		for (int left = 0; left < right; left++, right--) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
		}
		
		return new String(ch);
	}
	
	public static String times(char ch, int times) {
		String str = Character.toString(ch);
		for (int i = 1; i < times; i++) {
			str = str + ch;
		}
		return str;
	}
	
	public static void main(String[] args) {

		String raw = "aaaannn";
		
		int countalpha[] = new int [26];					// given all character are: UpperCase || Lowercase
		for(int i = 0; i < raw.length(); i++)
			countalpha[raw.charAt(i) - 'a'] += 1;				// 'b' (aka: 98) - 'a' (aka: 97) == 1
														// Hence count at index 1 is incremented for b
		String odd = "", even = "";
		
		for(int i = 0; i < 26; i++) {
			if (countalpha[i] > 0) {
				if (countalpha[i]%2 == 0)
					even = even + times((char)(i+'a'),countalpha[i]/2);
				else
					odd = odd + times((char)(i+'a'),countalpha[i]);
			}
		}
		
		System.out.println(reverse(even)+odd+even);

	}

}
