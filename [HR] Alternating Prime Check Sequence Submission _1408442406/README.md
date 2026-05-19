# Alternating Prime Check Sequence Submission #1408442406

### Difficulty: Medium

## Description

HackerRank
|
Prepare
Certify
Compete
 
All Contests  crt-27-technical-online-sessions-2-6  Alternating Prime Check Sequence
Alternating Prime Check Sequence
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
    // Optimized helper function to check if a number is prime
7
    public static boolean isPrime(int num) {
8
        // Direct checks for numbers less than 5
9
        if (num <= 1) return false;
10
        if (num == 2 || num == 3) return true;
11
        if (num % 2 == 0 || num % 3 == 0) return false;
12
​
13
        // Start checking directly from 5 and step by 6
14
        for (int i = 5; i * i <= num; i += 6) {
15
            if (num % i == 0 || num % (i + 2) == 0) {
16
                return false;
17
            }
18
        }
19
        return true;
20
    }
21
​
22
    public static void main(String[] args) {
23
        Scanner sc = new Scanner(System.in);
24
        
25
26
        int n = sc.nextInt();
27
        
28
        int[] arr = new int[n];
29
        for (int i = 0; i < n; i++) {
30
            arr[i] = sc.nextInt();
31
        }
32
        
33
        // Edge case: A sequence of 1 element is always alternating by default
34
        if (n <= 1) {
35
            System.out.println("YES");
36
            return;
37
        }
38
​
39
        boolean alternating = true;
40
        // Check if adjacent elements alternate between prime and non-prime
41
        for (int i = 0; i < n - 1; i++) {
42
            boolean currentPrime = isPrime(arr[i]);
43
            boolean nextPrime = isPrime(arr[i + 1]);
44
            
45
            // If both are prime or both are non-prime, alternation breaks
46
            if (currentPrime == nextPrime) {
47
                alternating = false;
48
                break;
49
            }
50
        }
51
​
52
        if (alternating) {
53
            System.out.println("YES");
54
        } else {
55
            System.out.println("NO");
56
        }
57
    }
58
}

Interview Prep | Blog | Scoring | Environment | FAQ | About Us | Support | Careers | Terms Of Service | Privacy Policy |

Pushing...

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
Test cases not found.
```