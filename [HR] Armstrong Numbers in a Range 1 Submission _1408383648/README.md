# Armstrong Numbers in a Range 1 Submission #1408383648

### Difficulty: Medium

## Description

HackerRank
|
Prepare
Certify
Compete
 
All Contests  StPeters Session 3 crt2026  Armstrong Numbers in a Range 1
Armstrong Numbers in a Range 1
Problem
Submissions
Leaderboard
Discussions

Submitted a few seconds ago • Score: 20.00

Status: Accepted
 Test Case #0
 Test Case #1
 Test Case #2
 Test Case #3


Submitted Code

Language: Java 8

 Open in editor
1
import java.io.*;
2
import java.util.*;
3
​
4
public class Solution {
5
​
6
    public static void main(String[] args) {
7
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
8
        Scanner sc=new Scanner(System.in);
9
        int n=sc.nextInt();
10
        
11
        for(int i=1;i<=n;i++)
12
        {
13
            
14
             // Calculate the number of digits using log10
15
            int digits = (int) Math.floor(Math.log10(i)) + 1;
16
            int sum=0;
17
            int temp=i;//temp variable 
18
            while(temp>0)
19
            {
20
                int remainder=temp%10;
21
                sum+=Math.pow(remainder,digits);
22
                temp/=10;
23
            }
24
            
25
            if(sum==i) System.out.print(sum+" ");
26
            
27
        }
28
        
29
    }
30
}

Interview Prep | Blog | Scoring | Environment | FAQ | About Us | Support | Careers | Terms Of Service | Privacy Policy |

Pushing...

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
```