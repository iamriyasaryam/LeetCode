/*
 Problem 1929. Concatention of Array
 Given an integer array nums of length n.you want to crete an array ans
 of length 2n where ans[i] == nums[i] and and ans[i+n] == nums[i] for 0<=i<n
 */
public class concatention { 

    public static void main(String args[]){
    int nums[] = {1,2,1};
    int arr[] = getConcatention(nums);
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
      }

    }

    public static int[] getConcatention(int nums[]){
        int n = nums.length;
        int ans[] = new int[2*n];
        for(int i=0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
