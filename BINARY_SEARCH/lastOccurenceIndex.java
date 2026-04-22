package BINARY_SEARCH;
//INDEX OF LAST OCCURENCE IN SORTED ARRAY
//EFFICIENT METHOD(Iterative Code)
//TIME COMPLEXITY=O(log n)
//SPACE COMPLEXITY=O(1)
public class lastOccurenceIndex {
    /*static int lastOccurence(int arr[], int x)
    {
        int low =0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
            {
                if(mid==arr.length-1||arr[mid]!=arr[mid+1])
                    return mid;
                else
                    low=mid+1;
            }
            else if(arr[mid]>x)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,33,33,33,40,40,55,55,55,100};
        int x=40;
        System.out.println(lastOccurence(arr, x));
    }*/


//EFFICIENT METHOD 2(Recursive Code)
//TIME COMPLEXITY: O(log n)
//Space complexity:O(log n)
    static int lastOccurence(int arr[], int low,int high,int x)
    {
        if(low>high)    return -1;
        int mid=(low+high)/2;
        if(arr[mid]==x)
        {
            if(mid==arr.length-1||arr[mid+1]!=arr[mid])
                return mid;
            else
                return lastOccurence(arr, mid+1, high, x);
        }
        else if(arr[mid]>x)
            return lastOccurence(arr, low, mid-1, x);
        else
            return lastOccurence(arr,mid+1,high,x);
    }
    public static void main(String[] args) {
        int arr[]={2,33,33,44,55,100};
        int low=0;
        int high=arr.length-1;
        int x=303;
        System.out.println(lastOccurence(arr, low, high, x));
    }
}
