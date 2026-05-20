# Reverse the Array 30 Submission #1408468526

### Difficulty: Medium

## Description

HackerRank
|
Prepare
Certify
Compete
 
All Contests  Automation-1  Reverse the Array 30
Reverse the Array 30
Problem
Submissions
Leaderboard
Discussions

Submitted a few seconds ago • Score: 30.00

Status: Accepted
 Test Case #0
 Test Case #1
 Test Case #2
 Test Case #3
 Test Case #4


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
    public static void arrayReverse(int[] arr) 
7
    { 
8
        int temp,len=arr.length; 
9
        for(int i=0;i<=len/2;i++) 
10
        { 
11
            temp=arr[len-1]; 
12
            arr[len-1]=arr[i]; 
13
            arr[i]=temp; 
14
            len-=1; 
15
        } 
16
    
17
    }
18
    public static void main(String[] args) {
19
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
20
        Scanner sc=new Scanner(System.in);
21
        int n=sc.nextInt();
22
        int[] arr=new int[n];
23
        
24
        for(int i=0;i<n;i++)
25
        {
26
            arr[i]=sc.nextInt();
27
        }
28
        
29
        arrayReverse(arr);
30
        
31
        for(int i=0;i<n;i++)
32
        {
33
            System.out.print(arr[i]+" ");
34
        }
35
    }
36
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