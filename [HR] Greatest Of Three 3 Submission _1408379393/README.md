# Greatest Of Three 3 Submission #1408379393

### Difficulty: Medium

## Description

HackerRank
|
Prepare
Certify
Compete
 
All Contests  StPeters Session 1 crt2026  Greatest Of Three 3
Greatest Of Three 3
Problem
Submissions
Leaderboard

Submitted a few seconds ago • Score: 10.00

Status: Accepted
 Test Case #0
 Test Case #1
 Test Case #2


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
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
10
        int max=a;
11
        if(b>a && b>c) max=b;
12
        else if(c>a & c>b) max=c;
13
        
14
        System.out.println(max);
15
    }
16
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