class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = 0;
        int a = 0;

        while(n<s.length() && a<t.length()) {
            if(s.charAt(n)==t.charAt(a)) {
                n++;
            }
            a++;
        }
        return n == s.length();

    }
}