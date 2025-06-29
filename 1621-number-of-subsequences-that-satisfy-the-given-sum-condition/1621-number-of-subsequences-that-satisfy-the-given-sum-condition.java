class Solution {
    public int numSubseq(int[] nums, int target) {
        int mon = 1000000007, n=nums.length;
        Arrays.sort(nums);

        int[] pow = new int[n];
        pow[0]=1;
        for(int i=1;i<n;i++){
            pow[i] = (pow[i-1]*2) % mon;
        }
        int left = 0, right =n-1,result = 0;
        while(left<=right){
            if(nums[left]+nums[right]<=target){
                result = (result+pow[right-left])%mon;
                left++;
            }else{
                right--;
            }
        }
        return result;
    }
}