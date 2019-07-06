package testing;

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class Problem {
    public static void main(String args[] ) throws Exception {
        
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         
         int n = Integer.parseInt(bf.readLine().trim());
         
         String str[] = bf.readLine().split(" ");
         int b[] = new int[n];
         int count[] = new int[1001];
         for (int i = 0; i < n; i++){
             b[i] = Integer.parseInt(str[i]);
             count[b[i]] += 1;
         }
         
         System.out.println(count[2]);
         
         System.out.println(Arrays.toString(count));
         
         int q = Integer.parseInt(bf.readLine().trim());
         
         System.out.println();
         
         int query[] = new int[q];
         int i = 0;
         
         while (q-- > 0){
             query[i++] = Integer.parseInt(bf.readLine().trim());
         }
         
         System.out.println(Arrays.toString(query));
         
         for (int j = 0; j < q; j++){
                 System.out.println(count[query[j]]);
             }

        // Write your code here

    }
}

