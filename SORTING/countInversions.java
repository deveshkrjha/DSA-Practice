package SORTING;
//COUNT INVERSIONS IN AN ARRAY
//A pair arr[i] and arr[j] forms an inversion when i<j && arr[i]>arr[j]
public class countInversions {
    //NAIVE SOLUTION
    //TIME COMPLEXITY=O(n^2)
    static int inversions(int arr[]){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2};
        System.out.println(inversions(arr));
    }
}
