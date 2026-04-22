//1752. Check if Array Is Sorted and Rotated
package ARRAY;

class rotatedSorted {
    public static boolean check(int[] nums) {
        int count = 1;
        int N = nums.length;

        for (int i = 1; i < 2 * N; i++) {
            if (nums[i % N] >= nums[(i - 1) % N]) {
                count++;
            } else {
                count = 1;
            }

            if (count == nums.length) {
                return true;
            }
        }

        return nums.length == 1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(check(nums));
    }
}