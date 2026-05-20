# Character Pattern Printing

### Difficulty: Medium

## Description

HackerRank
|
Prepare
Certify
Compete
 
All Contests  Automation-1  Character Pattern Printing
Character Pattern Printing
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
    // Fix 1: Make the method static
7
    static void printCharacterPattern(int num) {
8
        // Fix 2: Loop from i = 0 up to num
9
        for (int i = 0; i < num; i++) {
10
            // Fix 3: Loop j <= i to print the correct number of characters
11
            for (int j = 0; j <= i; j++) {
12
                // Fix 4: Cast the addition back to a char
13
                System.out.print((char)('a' + j));
14
            }
15
            // Fix 5: Print a new line after each row is complete
16
            System.out.println();
17
        }
18
    }
19
​
20
    public static void main(String[] args) {
21
        Scanner sc = new Scanner(System.in);
22
        int n = sc.nextInt();
23
​
24
        // Fix 6: Call the method correctly without 'void' and using 'n'
25
        printCharacterPattern(n);
26
​
27
        sc.close();
28
    }
29
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