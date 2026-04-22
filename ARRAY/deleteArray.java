package ARRAY;

public class deleteArray {
    static int delete(int arr[], int n, int x)
    {
        int i;
        for(i=0;i<n;i++)
            if(arr[i]==x)
                break;
        if(i==n)
            return n;
        for(int j=i;j<n-1;j++)
            arr[j]=arr[j+1];
        return n-1;
    }
    public static void main(String[] args)
    {
        int A[]={3,4,5,6,7,10};
        int n=6;
        int x=5;
        System.out.println("Before Deletion: ");
        for(int i=0;i<n;i++)
            System.out.print(A[i]+" ");
        System.out.println();
        n=delete(A, n, x);
        System.out.println("After Deletion: ");
        for(int i=0;i<n;i++)
            System.out.print(A[i]+" ");
    }
}
