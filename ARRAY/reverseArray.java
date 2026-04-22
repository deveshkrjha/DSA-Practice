package ARRAY;

public class reverseArray {
    static void reverse(int arr[])
    {
        int low=0,high=arr.length-1;
        while(low<high)
        {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int A[]={2,5,6,3,50,10,66};
        reverse(A);
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}
