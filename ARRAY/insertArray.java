package ARRAY;

public class insertArray {
    static int insert(int arr[],int n, int x,int capacity,int position)
    {
        if(n==capacity)
            return n;
        int index=position-1;
        for(int i=n-1;i>=index;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[index]=x;
        return n+1;
    }
    public static void main(String[] args) 
    {
        int arr[]=new int[5],capacity=5,n=3;
        arr[0]=2;arr[1]=4;arr[2]=5;
        System.out.println("Before Insertion");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int x=10,position=2;
        n=insert(arr, n, x, capacity, position);
        System.out.println("After Insertion");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }    
}
