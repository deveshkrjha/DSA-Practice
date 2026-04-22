package ARRAY;

public class searchArray {
    static int search(int arr[],int x)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int A[]={20,5,7,25};
        int x=15;
        System.out.println((search(A,x)));
    }
}
