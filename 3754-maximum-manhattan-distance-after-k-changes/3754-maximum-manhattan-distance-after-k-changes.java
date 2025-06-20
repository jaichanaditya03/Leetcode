class Solution {
    public int maxDistance(String s, int k) {
        int hor = 0, ver = 0,ans = 0;
        int n = s.length();
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            switch(ch){
                case 'N':
                ver++;
                break;
                case 'S':
                ver--;
                break;
                case 'E':
                hor++;
                break;
                case 'W':
                hor--;
                break;
            }
            ans = Math.max(ans, Math.min(Math.abs(hor)+Math.abs(ver)+k*2, i+1 ) );
        }
        return ans;
    }
}