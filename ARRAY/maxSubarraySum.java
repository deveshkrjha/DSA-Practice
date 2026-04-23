package ARRAY;
//Kadane's Algorithm

// You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].
// Note : A subarray is a continuous part of an array.

//Examples:
// Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
// Output: 11
// Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.

//Naive Approach
//Time Complexity: O(n^2)
//Auxiliary Space: O(1)
public class maxSubarraySum {
    // int SubarraySum(int[] arr) {
    //     // Code here
    //     int res=arr[0];
    //     for(int i=0;i<arr.length;i++){
    //         int current=0;
    //         for(int j=i;j<arr.length;j++){
    //             current=current+arr[j];
    //             res=Math.max(res,current);
    //         }
    //     }
    //     return res;
    // }
    

    //Efficient Approach(Kadane's Algorithm)
    //Time Complexity: O(n)
    //Auxiliary Space: O(1)
    int SubarraySum(int[] arr) {
        // Code here
        int res=arr[0];
        int maxEnding=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            res=Math.max(maxEnding,res);
        }
        return res;
    }
}
