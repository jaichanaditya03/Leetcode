class Solution {
    long createpalindrome(long num,boolean odd){
        long x= num;
        if(odd) x/=10;
        while(x>0){
            num = num*10+x%10;
            x/=10;
        }
        return num;
    }

    boolean isPalindrome(long num,int base){
        StringBuilder sa = new StringBuilder();
        while(num>0){
            sa.append((char)(num%base+'0'));
            num/=base;
        }
        String s = sa.toString();
        int i=0;int j=s.length()-1;
        while(i<j) if(s.charAt(i++)!=s.charAt(j--)) return false;
        return true;
    }

    public long kMirror(int k, int n) {
        long sum = 0;
        for(long len=1;n>0;len*=10) {
            for(long i=len;n>0 && i<len*10;i++){
                long p = createpalindrome(i,true);
                if(isPalindrome(p,k)) {sum+=p;n--;}
            }
            for(long i=len;n>0 && i<len*10;i++){
                long p = createpalindrome(i,false);
                if(isPalindrome(p,k)) {sum+=p;n--;}
            }
        }
        return sum;
    }
}