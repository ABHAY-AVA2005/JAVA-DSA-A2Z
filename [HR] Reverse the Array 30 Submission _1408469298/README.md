# Reverse the Array 30 Submission #1408469298

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
    public static void arrayReverse(int[] arr) {
7
        int len = arr.length;
8
        int temp;
9
​
10
        // Clean loop condition, no dynamically shrinking variables
11
        for (int i = 0; i < len / 2; i++) {
12
            temp = arr[len - 1 - i];
13
            arr[len - 1 - i] = arr[i];
14
            arr[i] = temp;
15
        }
16
    }
17
​
18
    public static void main(String[] args) {
19
        Scanner sc = new Scanner(System.in);
20
​
21
        // Read the size of the array
22
        int n = sc.nextInt();
23
        int[] arr = new int[n];
24
​
25
        // Read the array elements
26
        for (int i = 0; i < n; i++) {
27
            arr[i] = sc.nextInt();
28
        }
29
​
30
        // Reverse the array in place
31
        arrayReverse(arr);
32
​
33
        // Print the reversed array elements separated by a space
34
        for (int i = 0; i < n; i++) {
35
            System.out.print(arr[i] + " ");
36
        }
37
​
38
        sc.close();
39
    }
40
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