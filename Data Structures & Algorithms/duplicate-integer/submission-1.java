class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean isDuplicate = false; 

        for(int i=0; i<nums.length - 1; i++){
            int ans = nums[i] ^ nums[i+1];
            if(ans == 0) return true;
        }

        return isDuplicate;
    }
}