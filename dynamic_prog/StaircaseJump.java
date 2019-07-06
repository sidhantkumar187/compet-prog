package dynamic_prog;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

/*
 * 											
 */

public class StaircaseJump {

    static HashMap<Integer,Integer> hm = new HashMap<>();     // For memorizing the result
    //              covered, answer

    static int stepPerms(int n) {
        hm.clear();    // first clear the Results for previous TestCase
        return stepPermsHelper(n,0);       // calling the Logical Function
    }
    
    static int stepPermsHelper(int n, int covered){
        if (hm.containsKey(covered)){     // If already found answer then just return from looking into the Stored result in HashMap
            return hm.get(covered);
        }
        if (covered == n){
            return 1;       // Arrived onto destination return 1
        }
        else if (covered > n){    // Going away from the position needed return 0 no solution from here
            return 0;
        }
    
        hm.put(covered,stepPermsHelper(n,covered+1)+stepPermsHelper(n,covered+2)+stepPermsHelper(n,covered+3));

    return hm.get(covered);           // As the jumps possible are 1 ,2, 3  (so those jumps will be added to covered distance)
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int sItr = 0; sItr < s; sItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int res = stepPerms(n);

            bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

