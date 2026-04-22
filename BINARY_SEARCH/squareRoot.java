package BINARY_SEARCH;
//Square Root=Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.Floor value of any number is the greatest Integer which is less than or equal to that number.
//time complexity:O(log n)
//Space Complexity: O(1)

public class squareRoot {
    static int sqRootFloor(int x)
	{
		int low = 1, high = x, ans = -1;

		while(low <= high)
		{
			int mid = (low + high) / 2;

			int mSq = mid * mid;

			if(mSq == x)
				return mid;
			else if(mSq > x)
				high = mid - 1;
			else
			{
				low = mid + 1;
				ans = mid;
			}
		}

		return ans;
	}

	public static void main(String args[]) 
    {

		System.out.println(sqRootFloor(10));

    }
}
