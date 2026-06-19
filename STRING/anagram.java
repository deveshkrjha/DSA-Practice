package STRING;

// 242. Valid Anagram
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// Example 1:
// Input: s = "anagram", t = "nagaram"
// Output: true
import java.util.*;
public class anagram {
    //Naive Solution
    //Time Complexity= O(nlogn)
    //Space Complexity= (n)
    // public boolean isAnagram(String s, String t) {
    //     if(s.length()!=t.length()) {
    //         return false;
    //     }
    //     char a[]=s.toCharArray();
    //     Arrays.sort(a);
    //     s=new String(a);
    //     char b[]=t.toCharArray();
    //     Arrays.sort(b);
    //     t= new String(b);
    //     return s.equals(t);
    // }

    //Optimal Solution
    //Time Complexity= O(n+CHAR) where CHAR is the number of characters in the character set (e.g., 256 for extended ASCII)
    //Space Complexity= O(CHAR) for the count array
     public boolean isAnagram(String s, String t) {
        int CHAR=256;
        if(s.length()!=t.length()){
            return false;
        }
        int count[]=new int[CHAR];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        for(int i=0;i<CHAR;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}
