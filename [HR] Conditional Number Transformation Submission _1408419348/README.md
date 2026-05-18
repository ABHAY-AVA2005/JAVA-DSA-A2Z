# Conditional Number Transformation Submission #1408419348

### Difficulty: Medium

## Description

HackerRank
|
Prepare
Certify
Compete
 
All Contests  crt-27-technical-online-sessions-2-7  Conditional Number Transformation
Conditional Number Transformation
Problem
Submissions
Leaderboard
Discussions

Submitted a few seconds ago • Score: 0.00

Status: Queued


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
    public static void main(String[] args) {
6
        Scanner scanner = new Scanner(System.in);
7
​
8
        int n = scanner.nextInt();
9
​
10
            for (int i = 0; i < n; i++) {
11
                int num = scanner.nextInt();
12
​
13
                // Transform and print the number
14
                if (num % 2 == 0) {
15
                    System.out.print((num * 2) + " ");
16
                } else {
17
                    System.out.print((num + 3) + " ");
18
                }
19
            }
20
​
21
    }
22
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