package STRING;

public class palindrome {
    //NAIVE SOLUTION
    //TIME COMPLEXITY=O(n)
    //SPACE COMPLEXITY=O(n)
    static boolean ispalindrome(String str){
        StringBuilder rev=new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }


    //EFFICIENT SOLUTION
    //TIME COMPLEXITY=O(n)
    //SPACE COMPLEXITY=O(1)
    // static boolean ispalindrome(String str){
    //     int low=0;
    //     int high=str.length()-1;
    //     while(low<high){
    //         if(str.charAt(low)!=str.charAt(high))
    //         {
    //             return false;
    //         }
    //         low++;
    //         high--;

    //     }
    //     return true;
    // }
    public static void main(String[] args) {
        String str="devved";
        System.out.println(ispalindrome(str));
    }
}
