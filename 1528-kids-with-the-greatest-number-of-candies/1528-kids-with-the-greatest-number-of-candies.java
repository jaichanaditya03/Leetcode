class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> result = new ArrayList<>();
        int maxcandies = 0;
        for (int candy : candies){
            if(candy > maxcandies){
                maxcandies  = candy;
            }
        }
        for(int candy:candies){
            if(candy+extraCandies>=maxcandies){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}