class Solution {
    public int largestAltitude(int[] gain) {
        int maxal = 0;
        int currental = 0;

        for(int i=0;i<gain.length;i++){
            currental+=gain[i];
            maxal=Math.max(maxal,currental);
        }
        return maxal;
    }
}