# Password Strength Checker-crtprep

### Difficulty: Medium

## Description

Perform the function Checkpassword (char str[], int n) Execute the function which happens to be 1 if the str is a valid password or it remains 0. Conditions for a valid password: The password should have at least 4 characters. It should have at least 1 digit. It should have one capital letter. It should not have any spaces or obliques (/). The first character should not be a number. Assumption The input is not empty.

Input Format

A single string str representing the password.

Constraints

1 ≤ length(str) ≤ 100

The string contains letters, digits, symbols, or underscores.

The input will not be empty.

Output Format

Print 1 if the password is valid according to the rules.

Print 0 otherwise.

Sample Input 0

aA1_67


Sample Output 0

1


Sample Input 1

123abcDE


Sample Output 1

0

---
**Company Tags**: None
**Topic Tags**: None

## Test Cases

```
aA1_67

1

123abcDE

0

aA1_67

1

1
```