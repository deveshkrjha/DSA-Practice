package ARRAY;

public class moveZeroesToEnd {
    static void moveZeroes(int arr[])
    {
        //NAIVE SOLUTION
        //TIME COMPLEXITY=O(n^2)
        // for (int i = 0; i < arr.length - 1; i++) {
        //     if (arr[i] == 0) {
        //         for (int j = i + 1; j < arr.length; j++) {
        //             if (arr[j] != 0) {
        //                 int res = arr[i];
        //                 arr[i] = arr[j];
        //                 arr[j] = res;
        //             }
        //         }
        //     }
        // }

        
        //EFFICIENT SOLUTION
        //TIME COMPLEXITY=O(n)
        //AUX SPACE=O(1)
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[]={2,3,0,34,0,5,0,0,10};
        moveZeroes(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}
