package ARRAY;
public class secondLargestArray {
    static int secondLargest(int arr[])
    {
        int res=-1,largest=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[largest])
            {
                res=largest;
                largest=i;
                
            }
            else if(arr[i]>arr[res])
            {
                    res=i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={10,5,10};
        //res=secondLargest(arr);
        System.out.println(secondLargest(arr));
    }
}


//CORECT IMPLEMENTATION with handling corner cases. GFG PROBLEM SOLUTION:
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int res=-1;
        int lar=0;
        if(arr.length==1) return -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[lar]){
                res=lar;
                lar=i;
            }
            else if(arr[i]!=arr[lar]){
                if(res==-1||arr[i]>arr[res])
                    res=i;
            }
        }
        if(res==-1)
            return -1;
        else
            return arr[res];
    }
}
