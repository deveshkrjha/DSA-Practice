package SORTING;
import java.util.*;
//Union of two sorted arrays
public class unionSorted {
    //NAIVE SOLUTION
    //TIME COMPLEXITY=O((m+n)*log(m+n))
    //AUX SPACE=O(m+n)
    // static void union(int arr1[],int arr2[]){
    //     int arr3[]=new int[arr1.length+arr2.length];
    //     for(int i=0;i<arr1.length;i++){
    //         arr3[i]=arr1[i];
    //     }
    //     for(int i=0;i<arr2.length;i++){
    //         arr3[arr1.length+i]=arr2[i];
    //     }
    //     Arrays.sort(arr3);
    //     for(int i=0;i<arr1.length+arr2.length;i++){
    //         if(i==0||arr3[i]!=arr3[i-1]){
    //             System.out.print(arr3[i]+" ");
    //         }
    //     }
    // }
    // public static void main(String args[]){
    //     int arr1[]={2,2,3,4,5,5,6};
    //     int arr2[]={3,4,5,7,8,9};
    //     union(arr1, arr2);
    // }

    //EFFICIENT SOLUTION
    //TIME COMPLEXITY=O(M+N)
    //AUX SPACE=O(1)
    static void union(int arr1[],int arr2[]){
        int i=0,j=0;
        while(i<arr1.length&&j<arr2.length){
            if(i>0&&arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            if(j>0&&arr2[j]==arr2[j-1]){
                j++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }
            else if(arr1[i]>arr2[j]){
                System.out.print(arr2[j]+" ");
                j++;
            }
            else{
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
        while(i<arr1.length){
            if((i==0)||(i>0&&arr1[i]!=arr1[i-1])){
                System.out.print(arr1[i]+" ");
                i++;
            }
        }
        while(j<arr2.length){
            if((j==0)||(j>0&&arr2[j]!=arr2[j-1])){
                System.out.print(arr2[j]+" ");
                j++;
            }
        }
    }
    public static void main(String[] args){
        int arr1[]={2,3,3,4,5,5,6,7,7,9,9,9};
        int arr2[]={10};
        union(arr1, arr2);
    }
}
