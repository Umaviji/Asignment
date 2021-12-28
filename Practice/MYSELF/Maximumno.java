package Practice.MYSELF;

public class Maximumno {
	public static void main(String[] args) {
        int price[] = { 2, 30, 15, 10, 8, 25, 80 };
        int n = 7;
 
        // adding array
        int profit = 0;
 
        // Initializing variable
        // valley-peak approach
        /*
          
                       80
                       /
        30            /
       /  \          25
      /    15       /
     /      \      /
    2        10   /
               \ /
                8
         */
        for (int i = 1; i < n; i++) {
 
            // traversing through array from (i+1)th
            // position
            int sub = price[i] - price[i - 1];
            if (sub > 0)
                profit += sub;
        }
 
        System.out.print("Maximum Profit=" + profit);
    }

 
// This code is contributed by umadevi9616
}
