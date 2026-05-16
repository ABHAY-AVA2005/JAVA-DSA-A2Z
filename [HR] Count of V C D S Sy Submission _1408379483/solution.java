import java.io.*;
import java.util.*;
​
public class Solution {
​
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) {
            return;
        }
        String s = sc.nextLine();
        
        int lowerVowels = 0;
        int upperVowels = 0;
        int lowerConsonants = 0;
        int upperConsonants = 0;
        int digits = 0;
        int specialChars = 0;
        int spaces = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    lowerVowels++;
                } else {
                    lowerConsonants++;
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    upperVowels++;
                } else {
                    upperConsonants++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digits++;
            } else if (ch == ' ') {
                spaces++;
            } else {
                specialChars++;
            }
        }
        
        System.out.println(lowerVowels);
        System.out.println(upperVowels);
        System.out.println(lowerConsonants);
        System.out.println(upperConsonants);
        System.out.println(digits);
        System.out.println(specialChars);
        System.out.println(spaces);
    }
}