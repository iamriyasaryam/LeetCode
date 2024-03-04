/*
 Problem 1920. Build Array From Permutation
 Given a zero-based permuation nums(0-indexed), build an array ans of
 the same length where ans[i] = nums[nums[i]] for each 0<=i<nums.length and return it.
 */
public class buildArr {
    public static void main(String args[]){
        int nums[] = {0,2,1,5,3,4};
        int ans[] = buildArray(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

    public static int[] buildArray(int nums[]){
        int n = nums.length;
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
