class Solution {
    public String reverseWords(String s) {
       String[] words = s.split(" +");
       StringBuilder jai = new StringBuilder();
       for(int i = words.length-1;i>=0;i--) {
        jai.append(words[i]);
        jai.append(" ");
       } 
       return jai.toString().trim();
    }
}