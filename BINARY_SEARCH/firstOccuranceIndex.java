package BINARY_SEARCH;
//INDEX OF FIRST OCCURANCE IN SORTED ARRAY
//METHOD 1(NAIVE)
//TIME COMPLEXITY:O(N)
public class firstOccuranceIndex {
    /*static int firstOccurrence(int arr[], int n, int x)
	{
		for(int i = 0; i < n; i++)
			if(arr[i] == x)
				return i;

		return -1;
	}

	public static void main(String args[]) 
    {
        int arr[] = {5, 10, 10, 15, 15}, n = 5;

		int x = 15;
    
        System.out.println(firstOccurrence(arr, n, x));
		
    }*/

//METHOD 2(Efficient Code(Recursive))
//TIME COMPLEXITY:O(log n)
//SPACE COMPLEXITY:O(log n)
/*static int firstOcc(int arr[], int low, int high, int x)
{
	if(low > high)
		return -1;

	int mid = (low + high) / 2;

	if(x > arr[mid])
		return firstOcc(arr, mid + 1, high, x);

	else if(x < arr[mid])
		return firstOcc(arr, low, mid - 1, x);

	else
	{
		if(mid == 0 || arr[mid - 1] != arr[mid])
			return mid;

		else
			return firstOcc(arr, low, mid - 1, x);
	}
}

public static void main(String args[]) 
{
	int arr[] = {5, 10, 10, 15, 20, 20, 20}, n = 7;

	int x = 20;
	
	System.out.println(firstOcc(arr, 0, n - 1, x));


}*/

//METHOD 3(Efficient Code(Iterative))
//Time complexity: O(log n)
//Space complexity:O(1)
	static int firstOccurence(int arr[],int x)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==x)
			{
				if(mid==0||arr[mid-1]!=arr[mid])
					return mid;
				else
					high=mid-1;
			}
			else if(arr[mid]>x)
				high=mid-1;
			else
				low=mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]={2,33,33,33,45,60,60,100};
		int x=60;
		System.out.println(firstOccurence(arr, x));
	}
}
