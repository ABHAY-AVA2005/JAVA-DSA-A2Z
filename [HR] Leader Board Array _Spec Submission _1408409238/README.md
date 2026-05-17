# Leader Board Array -Spec Submission #1408409238

### Difficulty: Medium

## Description

HackerRank
|
Prepare
Certify
Compete
 
All Contests  Arrays Level-1 Programs  Leader Board Array -Spec
Leader Board Array -Spec
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
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named
8
        Solution. */
9
        Scanner sc=new Scanner(System.in);
10
        int n=sc.nextInt();
11
        int[] arr=new int[n];
12
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
13
        
14
        int max=arr[n-1];
15
        for(int i=n-2;i>=0;i--)
16
        {
17
         if(arr[i]>max)
18
         {
19
             max=arr[i];
20
             System.out.print(max+" ");
21
         }
22
        }
23
        
24
    }
25
}

Interview Prep | Blog | Scoring | Environment | FAQ | About Us | Support | Careers | Terms Of Service | Privacy Policy |

Pushing...

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named
```