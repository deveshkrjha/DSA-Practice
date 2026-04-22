package BINARY_SEARCH;
//Leetcode=162. Find Peak Element
public class peak {
    class Solution {

        public int peakElement(int[] arr) {
            // code here
            int low=0,high=arr.length-1;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if((mid==0||arr[mid-1]<=arr[mid])&&(mid==high||arr[mid+1]<=arr[mid]))
                    return mid;
                else if(mid>0&&arr[mid-1]>arr[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
            return -1;
        }
    }
    
}
