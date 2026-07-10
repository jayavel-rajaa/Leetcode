class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int ind = 0;

        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<i;j++){
                if(nums[i] == nums[j]){
                    c++;
                }
            }
            if(c==0){
                nums[ind++] = nums[i];
            }
        }
        return ind;
    }
}