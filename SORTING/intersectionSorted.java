package SORTING;
//GFG:Intersection of two sorted arrays

import java.util.ArrayList;

public class intersectionSorted {
//NAIVE SOLUTION
//TIME COMPLEXITY=O(M*N) where m and n are the size of array 1 and array 2
//     class Solution {
//     // Function to return a list containing the intersection of two arrays.
//     static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
//         // add your code here
//         ArrayList<Integer> integerList=new ArrayList<>();

//         for(int i=0;i<arr1.length;i++){
//             if(i>0&&arr1[i]==arr1[i-1]){
//                 continue;
//             }
//             for(int j=0;j<arr2.length;j++){
//                 if(arr2[j]==arr1[i]){
//                     //System.out.print(arr1[i]);
//                     integerList.add(arr1[i]);
//                     break;
//                 }
//             }
//         }
//         return integerList;
//     }
// }


//EFFICIENT SOLUTION
//TIME COMPLEXITY=O(M+N) where m and n are the size of array 1 and array2
class Solution {
    // Function to return a list containing the intersection of two arrays.
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        // add your code here
        ArrayList<Integer> integerList=new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length&&j<arr2.length){
            if(i>0&&arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                integerList.add(arr1[i]);
                i++;
                j++;
            }
        }
        return integerList;
    }
}
}
