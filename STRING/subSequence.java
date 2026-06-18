package STRING;
// Given two strings s1 and s2. You have to check that s1 is a subsequence of s2 or not.
// Note: A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements.

// Examples:
// Input: s1 = "AXY", s2 = "YADXCP"
// Output: false
// Explanation: s1 is not a subsequence of s2 as 'Y' appears before 'A'.
// Input: s1 = "gksrek", s2 = "geeksforgeeks"
// Output: true
// Explanation: If we combine the bold character of "geeksforgeeks", it equals to s1. So s1 is a subsequence of s2. 

// Time Complexity: O(n)
// Space Complexity: O(1)
public class subSequence {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        int j=0;
        for(int i=0;i<s2.length()&&j<s1.length();i++){
            if(s1.charAt(j)==s2.charAt(i)){
                j++;
            }
        }
        return j==s1.length();
    }
}
