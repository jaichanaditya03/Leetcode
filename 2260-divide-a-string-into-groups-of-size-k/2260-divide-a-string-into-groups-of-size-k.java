class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        List<String> jai = new ArrayList<>();
        for(int i=0;i<len;i+=k){
            int end = Math.min(i+k,len);
            String last = s.substring(i,end);
        
        if(last.length()<k) {
            last+=String.valueOf(fill).repeat(k-last.length());
        }
            jai.add(last);
        }
        return jai.toArray(new String[0]);
    }
}














