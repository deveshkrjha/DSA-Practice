package ARRAY;
//Leaders in a Array
//I/P= arr[]={7,10,4,3,6,5,2}
//o/p=10 6 5 2
//I/P= arr[]={10,20,30}
//O/P=30
//I/P= arr[]={30,20,10}
//O/P=30 20 10

public class leaders {
    //SOLUTION 1st(NAIVE METHOD)
    //TIME COMPLEXITY=O(n^2)
    //SPACE COMPLEXITY=O(1)
    /*static void leader(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            boolean flag=false;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<=arr[j])
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                System.out.print(arr[i]+" ");
            }
            
        }
    }
    public static void main(String[] args)
    {
        int  arr[]={7,10,4,10,6,5,2};
        int n=arr.length;
        leader(arr, n);
    }*/

    //SOLUTION 2nd(EFFICIENT METHOD)
    //TIME COMPLEXITY=O(n)
    //SPACE COMPLEXITY=O(n)
    static void leader(int arr[] , int n)
    {
        int current_leader=arr[n-1];
        System.out.print(current_leader+" ");
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>current_leader)
            {
                current_leader=arr[i];
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={7,10,4,10,6,5,2};
        int n=arr.length;
        leader(arr, n);
    }
}
