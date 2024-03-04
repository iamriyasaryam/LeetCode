/*
 Problem 1512. Number of good pairs.
 Given an array of integers nums,return the number of good pairs.
 A pair (i,j) is called good if nums[i] == nums[j] and i<j.
 */

public class goodPairs {
    public static void main(String args[]){
        int nums[] = {1,2,3,1,1,3};
        numIndenticalPairs(nums);
    }
    public static int numIndenticalPairs(int nums[]){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    System.out.print("("+i +","+ j+")");
                    count++;
                }
            }
        }
        return count;
    }
}
