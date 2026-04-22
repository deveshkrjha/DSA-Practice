package ARRAY;

public class subArray3 {
//NAIVE SOLUTION
//TIME COMPLEXITY:O(N^3)
        public static int maxSum(int[] arr) {
            int maxSum = Integer.MIN_VALUE;
            int n = arr.length;
    
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int k = j + 1; k < n; k++) {
                        int sum = arr[i] + arr[j] + arr[k];
                        maxSum = Math.max(maxSum, sum);
                    }
                }
            }
            return maxSum;
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 9, 3, 7, 5, 8};
            System.out.println(maxSum(arr));
        }
    
    
}
