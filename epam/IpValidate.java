package epam;

public class IpValidate {
	
	static boolean inRange(String str) {
		
		
		
		return true;
	}
	
	static boolean isIp4 (String str) {
		
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
		
		String ip1[] = {"123.198.0.1" , "123,198,23,4" , 
						"14e.av.54,40", "123.98.23.",
						"299.255.244.23" , "...",
						"432.12a.25.25", "123.198.0.1."};
		
		for (String str : ip1) {
			System.out.println(str+" is Valid : "+isIp4(str));
		}

	}

}
