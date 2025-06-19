class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int an = 1;
        int re = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i] - re > k ){
                an++;
                re  = nums[i];
            }
        }
        return an;
    }
}