// Trapping Rain Water
// Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season.


public class trappingRainwater {
    //efficient Approach but uses extra space
    //Time Complexity: O(n)
    //Auxiliary Space: O(n)
    public int maxWater(int[] arr) {
        int res=0;
        int lmax[]=new int[arr.length];
        int rmax[]=new int[arr.length];
        lmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            lmax[i]=Math.max(arr[i],lmax[i-1]);
        }
        rmax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }
        for(int i=1;i<arr.length-1;i++){
            res=res+(Math.min(rmax[i],lmax[i])-arr[i]);
        }
        return res;
    }
}
