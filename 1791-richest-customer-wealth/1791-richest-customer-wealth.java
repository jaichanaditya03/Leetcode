class Solution {
    public int maximumWealth(int[][] accounts) {
         int maxwealth=0;
        for(int[] cus:accounts){
            int curcuswel=0;
            for(int bank:cus){
                curcuswel += bank;
            }
            maxwealth=Math.max(maxwealth,curcuswel);
        }
        return maxwealth;
    }
}