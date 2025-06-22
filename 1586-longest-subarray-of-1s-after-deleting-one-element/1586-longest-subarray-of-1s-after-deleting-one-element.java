class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int  le = 0;
        int  ze = 0;
        int  ans = 0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                ze++;
            }
            while(ze>1) {
                if(nums[le]==0){
                    ze--;
                }
                le++;
            }
            ans = Math.max(ans,i-le+1-ze);
        }
        return (ans==n) ?ans-1 : ans;
    }
}