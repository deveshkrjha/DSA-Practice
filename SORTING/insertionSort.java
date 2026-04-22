package SORTING;
//The task is to complete the insertsort() function which is used to implement Insertion Sort.
public class insertionSort {
    public void insertion(int arr[]) {
        // code here
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int key=arr[i];
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}  