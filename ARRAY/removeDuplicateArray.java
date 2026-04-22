package ARRAY;
//REMOVE DUPLICATE ARRAY FROM SORTED ARRAY
public class removeDuplicateArray {
    static int removeElement(int arr[])
    {
        int res=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[res-1])
            {
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int A[]={2,4,4,6,6,8,10,20,20};
        int res=removeElement(A);
        for(int i=0;i<res;i++)
        {
            System.out.print(A[i]+" ");
        }

    }
}
