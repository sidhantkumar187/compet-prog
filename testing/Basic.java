package testing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;



class Arrange implements Comparator<Integer>{
	
	public static int[] getDigit(int no) {
		int arr[] = new int[3];
		int i = 0;
		while(no>9) {
			arr[i++] = no%10;
			no = no/10;
		}
		return arr;
	}
    
    public int compare(Integer a, Integer b){
    	int one = a.intValue();
    	int two = b.intValue();
    	
    	int n1 = Integer.toString(one).length();
    	int n2 = Integer.toString(two).length();
    	
    	if (n1 == n2) {
    		return a - b;
    	}
    	else {
    	
    	}
    	
    	
        return 0;
    }
}

public class Basic {
	
	public static int getDigitSum(String str){
        int length = str.length();
        int sum = 0;
        while (length-- > 0){
            sum += Character.getNumericValue(str.charAt(length));
        }
        return sum;
    }
	
	static boolean isPowerOfTwo(int x) {
		if (x == 0) {
			return false;
		}
		while (x%2==0) {
			x /=2;
		}
		return (x==1);
	}
	
	static boolean onlyOne(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				count++;
				if (count > 1)
					return false;
			}
		}
		return true;
	}
	
	  public static void getvalues(String s1) {
		    int sum = 0;
		    for (int i = 0; i < s1.length(); i++) {
		      char a = s1.charAt(i);
		      if (Character.isDigit(a)) {
		        int b = Integer.parseInt(String.valueOf(a));
		        sum = sum + b;
		      }
		    }
		    if (sum == 0) {
		      System.out.println(-1);
		    } else
		      System.out.println(sum);
		  }

	public static void main(String[] args) {

		int arr[] = new int[100];
		
		for (int i = 0; i < 10; i++) {
			arr[i] = i+1;
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------------");
		
		System.out.println((int)Math.pow(10, 1));;
		
		System.out.println(getDigitSum(Integer.toString(236467)));
		
		System.out.println("jhgkjhvkhg".substring(0, 4));
		
		String str = "";
		
		System.out.println(str.length());
		
		getvalues(str);
		
		int a = 10, b = 20;
		int max = 0;
		if ((max = Math.min(a, b)) > 0) {
			System.out.println("MAX be :::::::::::::::::::::::"+max);
		}
		
		System.out.println("-----------------------------------");
		
//		String arrs1[] = {"3","30"};
		
//		System.out.println("3 > 30 "+new Arrange().compare("3","30"));
		
		System.out.println("30".compareTo("3"));
		
		String arrs[] = {"60","546","54","548"};
		
		Arrays.sort(arrs, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(arrs));
		
		System.out.println("-------------------------------");
		
		System.out.println(onlyOne(Integer.toBinaryString(15)));
		
		System.out.println(isPowerOfTwo(256));
		
		System.out.println("################################");
		
		System.out.println((28 & (1 << 3)) == (1 << 3));
		
		System.out.println(Integer.toBinaryString(28));		

	}

}
