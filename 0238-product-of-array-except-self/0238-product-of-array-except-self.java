class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int productLeft = 1;
        int productRight = 1;

        for(int i = n-1;i>=0;i--){
            ans[i] = productRight;
            productRight = productRight*nums[i];
        }
        for(int i = 0;i<n;i++){
            ans[i]=ans[i]*productLeft;
            productLeft = productLeft*nums[i];
        }
        return ans;
    }
}