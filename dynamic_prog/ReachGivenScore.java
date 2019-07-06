package dynamic_prog;

import java.io.*;

// Commented Solution is not Mentos or Real Zindagi. It's burdened zindagi Ohh ye wo HashMap, HashSet, Check unique
// reference : www.geeksforgeeks.com + its Video
// {3,5}
// {5,3}

// There is some similarity between these two Sets! Think of it... Answer at end of code

public class ReachGivenScore
 {
    // static isUnique(String str){
    //     String 
    // }
     
    // static HashMap<String,String> hs = new HashSet<String,String>();
     
    // static int getWays(int no){
    //     hs.clear();
    //     getWays(no, "");
    //     for (String temp : hs){
    //         System.out.print(temp+" ");
    //     }
    //     System.out.println();
    //     return hs.size();
    // }
    
    // static String getWays(int no, String included){
    //     if (no < 0){
    //         return "";
    //     }
    //     else if (no == 0){
    //         return included;
    //     }
    //     String result = getWays(no-3,included+"3"+",") + getWays(no-5, included+"5"+",") + getWays(no-10,included+"10"+",");
        
    //     if (isUnique(result)){
    //         result_set.add(included);
    //     }
        
    //     return result;
    // }
    
    public static int ways(int n)
     {
         int table[]=new int[n+1];
         table[0]=1;
         int i;
         
         for (i=3; i<=n; i++)
            table[i] += table[i-3];
            
         for (i=5; i<=n; i++)
            table[i] += table[i-5];     // Reaching n with help of 3 given results
            
         for (i=10; i<=n; i++)          // Reaching n with help of 3,5 given mutual results
            table[i] += table[i-10]; 
                                        // One hint about this DP is that:
                                        // We can reach to particular mukam with help of other previous steps (3,5) if made to this mukaam
        return table[n];
     }
     
	public static void main (String[] args) throws IOException
	 {
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 int tc = Integer.parseInt(bf.readLine());
	    
	    while(tc>0){
	        
	        int no = Integer.parseInt(bf.readLine());
	        
	        System.out.println(ways(no));
	        
	        tc--;
	    }
	  bf.close();
	 }
}

// these two sets 3,5 and 5,3 both have same frequency of 5,3 respectively

// So use HashMap to achieve this


