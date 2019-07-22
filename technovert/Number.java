package technovert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {

	public static void main(String[] args) throws IOException{
		
		float rem = 0;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int no = Integer.parseInt(bf.readLine());
		
		int x = Integer.parseInt(bf.readLine());
		
		rem = (float)no/x;
		
		System.out.println((int)Math.round(rem)*x);
		
		rem = no%x;
		
		if (rem >= x-rem) {
			no += x-rem;
		}
		else {
			no -= rem;
		}
		
		System.out.println(no);

	}

}
