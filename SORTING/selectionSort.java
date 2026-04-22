package SORTING;
//Given an array arr, use selection sort to sort arr[] in increasing order.
public class selectionSort {
    void selection(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index])
                {
                    min_index=j;
                }
            }
            int res=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=res;
        }
    }
}
