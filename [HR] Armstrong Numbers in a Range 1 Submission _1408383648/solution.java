import java.io.*;
import java.util.*;
​
public class Solution {
​
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            
             // Calculate the number of digits using log10
            int digits = (int) Math.floor(Math.log10(i)) + 1;
            int sum=0;
            int temp=i;//temp variable 
            while(temp>0)
            {
                int remainder=temp%10;
                sum+=Math.pow(remainder,digits);
                temp/=10;
            }
            
            if(sum==i) System.out.print(sum+" ");
            
        }
        
    }
}