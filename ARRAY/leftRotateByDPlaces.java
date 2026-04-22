package ARRAY;
//LEFT ROTATE AN ARRAY BY d PLACE
public class leftRotateByDPlaces {
    //METHOD 1(NAIVE SOLUTION)
    //TIME COMPLEXITY:O(n*d)
    //AUXILARY SPACE:0(1)
    /*static void leftRotateOne(int arr[], int n) {
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    static void leftRotate(int arr[], int n, int d) {
        for (int i = 0; i < d; i++) {
            leftRotateOne(arr, n);
        }
    }

    public static void main(String[] args) {
        int A[] = { 2, 3, 4, 5, 6, 7 };
        int n = A.length;
        int d = 3;
        leftRotate(A, n, d);
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }*/

    //METHOD2(EFFICIENT SOLUTION)
    //TIME COMPLEXITY:O(n)
    //AUXILARY SPACE:O(1)
    static void leftRotate(int arr[],int n,int d)
    {
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int arr[],int low,int high)
    {
        while(low<high)
        {
            int res=arr[low];
            arr[low]=arr[high];
            arr[high]=res;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,56,7,88};
        int n=arr.length;
        int d=3;
        leftRotate(arr, n, d);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
