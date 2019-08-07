package epam;

import java.util.regex.Pattern;

public class IpValidate {
	
	static boolean isIp6Regex(String str) {
				
		return Pattern.matches("([0-9a-f]{1,4}:){7}([0-9a-f]{1,4})", str);
	}
	
	static boolean isIp4Regex(String str) {
		
		return Pattern.matches(" ([0-4a-f]) ", str);
	}
	
	static boolean inRange(String str) {
		
		if (str.length() < 1 || str.length() > 3) {
			return false;
		}
		int a = Integer.parseInt(str);		
		
		if (a < 0 || a > 255) {
			return false;
		}
		return true;
	}
	
	static boolean isIp4 (String str) {
		
		// NOTE : Would not work for 0.0.0.0. (Extra .)
		
		// Check for no of dots 
		String arr[] = str.split("[.]");        // regex or use (\\.)
		
		if (arr.length != 4)
			return false;
		
		for (String temp : arr) {
			if (!inRange(temp)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		String ip4[] = {"123.198.0.1" , "123,198,23,4" , 
						"14e.av.54,40", "123.98.23.",
						"299.255.244.23" , "...",
						"432.12a.25.25", "123.198.0.1.",
						"255.255.255.255", "0.0.0.0."};
		
		for (String str : ip4) {
			System.out.println(str+" is Valid IP4: "+isIp4(str));
		}
		
		String ip6[] = {"2001:0db8:0000:0000:0000:ff00:0042:8329",
						"0:0:0:0:0:0:0:0",
						"255:ffff:ffff:ffff:ffff:fff:eeee:dddd",
						"ggg:gggg:gggg:gggg:ggg:gg:gg:gg"};
		
		for (String str : ip6) {
			System.out.println(str+" is Valid IP6: "+isIp6Regex(str));
		}

	}

}
