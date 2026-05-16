# Palindrome Number Checker 5 Submission #1408383675

### Difficulty: Medium

## Description

HackerRank
|
Prepare
Certify
Compete
 
All Contests  StPeters Session 3 crt2026  Palindrome Number Checker 5
Palindrome Number Checker 5
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
        Scanner sc = new Scanner(System.in);
8
        
9
10
            return;
11
        }
12
        
13
        long n = sc.nextLong();
14
        long originalNumber = n;
15
        long reversedNumber = 0;
16
        
17
        // Reconstruct the number backwards
18
        while (n > 0) {
19
            long remainder = n % 10;
20
            reversedNumber = (reversedNumber * 10) + remainder;
21
            n /= 10;
22
        }
23
        
24
        // Check if the reversed number matches the original input
25
        if (originalNumber == reversedNumber) {
26
            System.out.println("Yes");
27
        } else {
28
            System.out.println("No");
29
        }
30
    }
31
}

Interview Prep | Blog | Scoring | Environment | FAQ | About Us | Support | Careers | Terms Of Service | Privacy Policy |

Pushing...

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
// Check if the reversed number matches the original input
```