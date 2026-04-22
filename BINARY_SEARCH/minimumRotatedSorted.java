package BINARY_SEARCH;
//leetcode=153. Find Minimum in Rotated Sorted Array
public class minimumRotatedSorted {
    class Solution {
        public int findMin(int[] nums) {
            int low=0,high=nums.length-1;
            while(low<high)
            {
                int mid=(low+high)/2;
                if(nums[mid]>nums[nums.length-1])
                    low=mid+1;
                else
                    high=mid;
            }
            return nums[low];
        }
    }
}
