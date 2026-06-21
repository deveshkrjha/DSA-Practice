package STRING;
// Non Repeating Character
// Given a string s consisting of lowercase English Letters. return the first non-repeating character in s. If there is no non-repeating character, return '$'.

// Examples:
// Input: s = "geeksforgeeks"
// Output: 'f'
// Explanation: In the given string, 'f' is the first character in the string which does not repeat.

//Optimal Solution
// Time Complexity: O(n)
// Space Complexity: O(1) because we are using a constant size array of 256 characters to store the count of each character in the string.
public class leftMostNonRepeating {
    public char nonRepeatingChar(String s) {
        // code here
        int[] count=new int[256];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)]==1){
                return s.charAt(i);
            }
        }
        return '$';
    }
}
