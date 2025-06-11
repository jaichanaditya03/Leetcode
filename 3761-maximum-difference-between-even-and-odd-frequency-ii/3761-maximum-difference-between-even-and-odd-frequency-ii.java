class Solution {
    public int maxDifference(String s, int k) {
        int n = s.length();
        int ans = Integer.MIN_VALUE;

        for (char a = '0'; a <= '4'; a++) {
            for (char b = '0'; b <= '4'; b++) {
                if (a == b) continue;

                int[] best = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
                int cnt_a = 0, cnt_b = 0;
                int prev_a = 0, prev_b = 0;
                int left = -1;

                for (int right = 0; right < n; right++) {
                    cnt_a += (s.charAt(right) == a ? 1 : 0);
                    cnt_b += (s.charAt(right) == b ? 1 : 0);

                    while (right - left >= k && cnt_b - prev_b >= 2) {
                        int left_status = getStatus(prev_a, prev_b);
                        best[left_status] = Math.min(best[left_status], prev_a - prev_b);
                        left++;
                        prev_a += (s.charAt(left) == a ? 1 : 0);
                        prev_b += (s.charAt(left) == b ? 1 : 0);
                    }

                    int right_status = getStatus(cnt_a, cnt_b);
                    int target_status = right_status ^ 0b10;

                    if (best[target_status] != Integer.MAX_VALUE) {
                        ans = Math.max(ans, (cnt_a - cnt_b) - best[target_status]);
                    }
                }
            }
        }

        return (ans == Integer.MIN_VALUE) ? -1 : ans;
    }

    private int getStatus(int cnt_a, int cnt_b) {
        return ((cnt_a % 2) << 1) | (cnt_b % 2);
    }
}
