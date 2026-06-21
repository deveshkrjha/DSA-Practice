package STRING;
// Repeating Character
// Given a string s, return the index of the first character that appears more than once in the string. If there is no repeated character, return -1.

// Examples:
// Input: s = "geeksforgeeks"
// Output: 0
// Explanation: We see that both 'e' and 'g' repeat as we move from left to right.But the leftmost is 'g' so we return leftmost index of 'g' that is 0.

//Time Complexity: O(n)
//Space Complexity: O(1) because we are using a constant size array of 256 characters to store the count of each character in the string.
public class leftMostRepeating {
     public int repeatedCharacter(String S) {
        // code here
        char[] count=new char[256];
        for(int i=0;i<S.length();i++){
            count[S.charAt(i)]++;
        }
        for(int i=0;i<S.length();i++){
            if(count[S.charAt(i)]>1){
                return i;
            }
        }
        return -1;
        
    }
}
