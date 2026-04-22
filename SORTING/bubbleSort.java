package SORTING;
//Given an array, arr[]. Sort the array using bubble sort algorithm.
public class bubbleSort {
    public static void bubble(int arr[]) {
        //naive code
        // for(int i=0;i<arr.length-1;i++)
        // {
        //     for(int j=0;j<arr.length-i-1;j++)
        //     {
        //         if(arr[j]>arr[j+1])
        //         {
        //             int res=arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=res;
        //         }
        //     }
        // }

        
        //efficient code
        for(int i=0;i<arr.length-1;i++)
        {
            boolean swapped=false;
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int res=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=res;
                    swapped=false;
                }
                if(swapped==true)
                    break;
            }
        }
    }
}
