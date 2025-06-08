class Solution {
    public String mergeAlternately(String word1, String word2) {
        int x=0,y=0;
        StringBuilder ans = new StringBuilder();
        for (int i=0;i<Math.max(word1.length(),word2.length());i++){
            if(x<word1.length()){
             ans.append(word1.charAt(x++));
            
            }
            if(y<word2.length()){
            ans.append(word2.charAt(y++));
                
            }
        }
        return ans.toString();
    }
}