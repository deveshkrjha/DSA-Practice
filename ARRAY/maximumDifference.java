package ARRAY;
//MAXIMUM DIFFRENCE PROBLEM WITH ORDER
//Maximum value of arr[j]-arr[i] such that j>i
//I/P: arr[]={2,3,10,6,4,8,1}
//O/P: 8
//I/P: arr[]={7,9,5,6,3,2}
//O/P: 2
//I/P: arr[]={30,10,8,2}
//O/P: -2
public class maximumDifference {
//METHOD 1(NAIVE)
//Time complexity:O(n^2)
//Auxiliary space:O(1)
    /*static int maxDiff(int arr[], int n)
    {
        int res=arr[1]-arr[0];
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                res=Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        int arr[]={2,3,10,6,4,8,1};
        int n=arr.length;
        System.out.println(maxDiff(arr,n));
    }*/

//METHOD 2(EFFICIENT)
//Time complexity:O(n)
//Auxiliary space:O(1)
    static int maxDiff(int arr[], int n)
    {
        int res=arr[1]-arr[0];
        int minVal=arr[0];
        for(int i=1;i<n;i++)
        {
            res=Math.max(res,arr[i]-minVal);//Math.max(a, b): This is a method from Java's Math class that returns the maximum of two numbers, a and b.
            minVal=Math.min(minVal,arr[i]);//Math.min(a, b): This is a method from Java’s Math class that returns the smaller of the two values a and b.
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={30,10,8,2};
        int n=arr.length;
        System.out.println(maxDiff(arr,n));
    }

}
