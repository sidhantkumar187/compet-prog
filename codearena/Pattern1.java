package codearena;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Tip : Scan a pattern like a PRO--------------

/*			Left pattern
 * 			Right pattern
 * 			
 * 			Upper part somewhat similar but mirror image of lower part
 * 
 * 			Spaces
 * 
 */

public class Pattern1 {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().replace("\\s",""));
        
        int count = 0;
        for (int i = 1; i <= n; i++){
            
            // for left spaces
            
            for (int ls = 1; ls<= n-i; ls++){
                System.out.print(" ");
            }
            System.out.print("/");
            // End space
            if (i > 1) {
            	System.out.print(" ");
            }
            
            // For middle part
            
            if (i > 2){
                System.out.print("/");
                for (int ms = 1; ms <= count; ms++){
                    System.out.print(" ");
                }
                System.out.print("\\");
                count+=2;
            }
            
            // For right part
            
            if (i > 1) {
            	System.out.print(" ");
            }
            System.out.print("\\");
            for (int es = 1; es <= n-1; es++){
                System.out.print(" ");
            }
            System.out.println();
        }
        count-=2;
        for (int i = 1; i <=n; i++) {
        	System.out.print("  ");
        	
        	for (int ls = 1; ls <= i-1; ls++) {
        		System.out.print(" ");
        	}
        	// Outer slash
        	System.out.print("\\");
        	// Between space
        	if (i < n)
        		System.out.print(" ");
        	// Inner slash pattern
        	if (i <= n-2) {
        		System.out.print("\\");
        		for (int ms = 1; ms <= count; ms++)
        			System.out.print(" ");
        		System.out.print("/");
        		count-=2;
        	}
        	// Outer again
        	if (i < n) {
        		System.out.print(" ");
        	}
        	// Outer Slash again
        	System.out.print("/");
        	System.out.println();
        }
        
    }
}

