class Solution {
    public String removeStars(String s) {
        StringBuilder jc = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                jc.deleteCharAt(jc.length()-1);
            }else{
                jc.append(s.charAt(i));
            }
        }
        return jc.toString();
    }
}