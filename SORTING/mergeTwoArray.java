package SORTING;

import java.util.Arrays;

//Leetcode= 88. Merge Sorted Array
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
public class mergeTwoArray {
    //NAIVE SOLUTION 
    //TIME COMPLEXITY=O((m+n)*(log(m+n)))
    //AUX SPACE=O(m+n)
    // public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int nums3[]=new int[m+n];
    //     for(int i=0;i<nums1.length;i++)
    //     {
    //         nums3[i]=nums1[i];
    //     }
    //     for(int j=0;j<nums2.length;j++)
    //     {
    //         nums3[j+m]=nums2[j];
    //     }
    //     Arrays.sort(nums3);
    //     for(int i=0;i<nums3.length;i++)
    //     {
    //         System.out.print(nums3[i]+",");
    //     }
    // }


    //GFG EFFICIENT CODE WHICH IS NOT WORKING(maybe working now)
    //TIME COMPLEXITY=O(m+n)
    //Space complexity=O(1)
    // public void mergeArrays(int a[], int b[],int n,int m) {
    //     // code here
    //     int i=0;
    //     int j=0;
    //     while(i<n&&j<m)
    //     {
    //         if(a[i]<=b[j])
    //         {
    //             System.out.print(a[i]+" ");
    //             i++;
    //         }
    //         else
    //         {
    //             System.out.print(b[j]+" ");
    //             j++;
    //         }
    //     }
    //     while(i<n)
    //     {
    //         System.out.print(a[i]+" ");
    //         i++;
    //     }
    //     while(j<m)
    //     {
    //         System.out.print(b[j]+" ");
    //         j++;
    //     }
    // }


    //EFFICIENT CODE(STRIVER)
    //TIME COMPLEXITY=O(min(n,m))+O(n(log n))+O(m(log m))
    //SPACE COMPLEXITY=O(1)
    public void mergeArrays(int a[], int b[]) {
        int n=a.length;
        int m=b.length;
        int i=n-1;
        int j=0;
        while(i>=0&&j<m)
        {
            if(a[i]>b[j])
            {
                int res=a[i];
                a[i]=b[j];
                b[j]=res;
                i--;
                j++;
            }
            else
            {
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }


}
