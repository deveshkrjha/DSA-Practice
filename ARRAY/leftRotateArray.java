package ARRAY;
//LEFT ROTATE AN ARRAY
public class leftRotateArray {
    static void rotate(int arr[]) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7};
        rotate(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

}
//TIME COMPLEXITY:O(n)
//SPACE COMPLEXITY:O(1)