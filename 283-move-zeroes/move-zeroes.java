class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]==k && nums[j+1] != k){
                int temp = nums[j+1];
                nums[j+1] = nums[j];
                nums[j] = temp;
                }
            }
        }
        
    }
}