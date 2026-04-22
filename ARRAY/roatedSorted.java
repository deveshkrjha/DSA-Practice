//1752. Check if Array Is Sorted and Rotated
package ARRAY;

class rotatedSorted {
    //method 1: sliding window technique
    //Time Complexity: O(n)
    // public static boolean check(int[] nums) {
    //     //if(nums.length==1)  return true;
    //     int count = 1;
    //     int N = nums.length;
    //     for (int i = 1; i < 2 * N; i++) {
    //         if (nums[i % N] >= nums[(i - 1) % N]) {
    //             count++;
    //         } else {
    //             count = 1;
    //         }
    //         if (count == nums.length) {
    //             return true;
    //         }
    //     }
    //     return nums.length == 1;
    // }

    //method 2: counting the number of times the order is violated
    //Time Complexity: O(n)
    public static boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                count++;
            }
        }
        return count<=1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(check(nums));
    }
}