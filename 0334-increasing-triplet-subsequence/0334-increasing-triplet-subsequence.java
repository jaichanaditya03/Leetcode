class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3) return false;
        int value1 = Integer.MAX_VALUE, value2= Integer.MAX_VALUE;
        for (int i = 0;i<nums.length;i++){
            if(nums[i]<=value1){
                value1 = nums[i];
            }
            else if(nums[i]<=value2){
                value2=nums[i];
            }else{
                return true;
            }
        }
        return false;

    }
}