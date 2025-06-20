class Solution {
    public int maxVowels(String s, int k) {
        int currcount = 0;
        Set<Character> vowels = Set.of('a','e','i','o','u');

        for(int i =0; i<k; i++){
            if(vowels.contains(s.charAt(i))){
                currcount++;
            }
        }

        int maxcount = currcount;

        for(int i = k; i<s.length();i++){
            if(vowels.contains(s.charAt(i))) {
                currcount++;
            }
            if(vowels.contains(s.charAt(i-k))) {
                currcount--;
            }
            maxcount = Math.max(currcount, maxcount);

            if(maxcount == k ) {
                return maxcount;
            }
        }
        return maxcount;
    }
}