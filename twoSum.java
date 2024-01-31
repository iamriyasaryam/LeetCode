public class twoSum {
    public static void main (String args[]){
        int nums[] = {3,2,4};
        int target = 6;
        twoSum(nums, target);
    }

    public static int twoSum(int nums[], int target ){
        int sum=0;
        for(int i=0; i<nums.length; i++ ){
            for(int j=i+1; j<nums.length; j++){
                 sum +=  nums[i] + nums[j];
                if(sum == target){
                    System.out.print(nums[i] +" "+ nums[j]);
                    break;
                }
            }
        }
        return sum;
        
    }
}