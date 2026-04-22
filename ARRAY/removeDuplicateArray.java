package ARRAY;
//REMOVE DUPLICATE ARRAY FROM SORTED ARRAY
public class removeDuplicateArray {
    static int removeElement(int nums[])
    {
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[count]){
                nums[count+1]=nums[i];
                count++;
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        int A[]={2,4,4,6,6,8,10,20,20};
        int res=removeElement(A);
        for(int i=0;i<res;i++)
        {
            System.out.print(A[i]+" ");
        }

    }
}
