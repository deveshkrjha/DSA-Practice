package BINARY_SEARCH;
//Number of occurrence
//Time complexity: O(log n)
//Space Complexity: O(1)
public class occurence {
     static int firstOccur(int arr[], int target)
    {
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                if(mid==0||arr[mid-1]!=arr[mid])
                    return mid;
                else
                    high=mid-1;
            }
            else if(arr[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
    static int lastOccur(int arr[], int target)
    {
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                if(mid==arr.length-1||arr[mid+1]!=arr[mid])
                    return mid;
                else
                    low=mid+1;
            }
            else if(arr[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
    static int countFreq(int[] arr, int target) {
        // code here
        int first=firstOccur(arr,target);
        if(first==-1)
            return 0;
        else
            return (lastOccur(arr,target)-first+1);
        
    }
    public static void main(String[] args) {
        int arr[]={2,3,3,3,3,44,55,1200};
        int x=3;
        System.out.println(countFreq(arr,x));
    }
}
