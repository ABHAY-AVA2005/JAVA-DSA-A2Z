# Count Digits Remainder

### Difficulty: Medium

## Description

The function countDigits is intended to return the remainder when the given number is divided by the number of digits in it. The function compiles successfully but does not give the correct result for some test cases because of logical errors.

int countDigits(int num) { int count=0; while(num!=0) { num=num/10; count++; } return (num%count); }

Input Format

A single integer num representing the given number.

Constraints

1≤num≤109

Output Format

An integer, the remainder when the number is divided by its digit count.

Sample Input 0

782


Sample Output 0

2


Sample Input 1

21340


Sample Output 1

0

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
```