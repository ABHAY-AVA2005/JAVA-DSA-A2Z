# Threshold Breaking Point Submission #1408441634

### Difficulty: Medium

## Description

HackerRank
|
Prepare
Certify
Compete
 
All Contests  crt-27-technical-online-sessions-2-6  Threshold Breaking Point
Threshold Breaking Point
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
        int threshold=sc.nextInt();
11
        int[] arr=new int[n];
12
        int prefixsum=0;
13
        for(int i=0;i<n;i++)
14
        {
15
            arr[i]=sc.nextInt();
16
            prefixsum+=arr[i];
17
            if(prefixsum>threshold){
18
                System.out.println(i);
19
                return;
20
            }
21
        }
22
        System.out.println(-1);
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
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
```