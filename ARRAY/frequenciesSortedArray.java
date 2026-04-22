package ARRAY;
//FREQUENCIES IN A SORTED ARRAY
//I/P: arr[]={10,10,10,25,30,30}
//O/P: 10  3
//     25  1
//     30  2
//I/P: arr[]={10,20,30}
//O/P: 10  1
//     20  1
//     30  1
//Time complexity:O(n)
//Space complexity:O(1)

public class frequenciesSortedArray {
     static void frequency(int arr[])
    {
        int freq=1,i=1;
        while(i<arr.length)
        {
            while (i<arr.length&&arr[i]==arr[i-1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" "+freq);
            i++;
            freq=1;
        }
        if(arr.length==1||arr[arr.length-1]!=arr[arr.length-2])
        {
            System.out.println(arr[arr.length-1]+" "+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={22,333,333,333,1000,1000,1000};
        frequency(arr);
    }
    
}
