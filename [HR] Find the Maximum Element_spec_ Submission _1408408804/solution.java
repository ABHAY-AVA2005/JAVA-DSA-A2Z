import java.io.*;
import java.util.*;
​
public class Solution {
​
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        // Read the number of elements
        int n = sc.nextInt();
        
        // Initialize max with the first element or the lowest possible value within constraints
        int max = Integer.MIN_VALUE;
        
        // Loop through all elements to find the maximum
        for (int i = 0; i < n; i++) {
            int current = sc.nextInt();
            if (current > max) {
                max = current;
            }
        }
        
        // Print the maximum element found
        System.out.println(max);
        
        sc.close();
    }
}