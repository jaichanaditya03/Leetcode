class Solution {
        private int countPairs(int[] nums, int diff) {
        int i = 0, cnt = 0, n = nums.length;
        while (i < n - 1) {
            if (nums[i + 1] - nums[i] <= diff) {
                cnt++;
                i++;
            }
            i++;
        }
        return cnt;
    }

    public int minimizeMax(int[] nums, int p) {
       int n = nums.length;
        Arrays.sort(nums);
        int low = 0, high = nums[n - 1] - nums[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cnt = countPairs(nums, mid);
            if (cnt >= p) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans; 
    }
}