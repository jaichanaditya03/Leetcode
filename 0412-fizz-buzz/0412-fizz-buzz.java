class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList(n);
        for(int i=1;i<=n;i++){
            boolean divisibleby3=i%3==0;
            boolean divisibleby5=i%5==0;
             
             String currstr="";
             if(divisibleby3 && divisibleby5){
                ans.add("FizzBuzz");
             }
                else if (divisibleby3){
                    ans.add("Fizz");
                }
                    else if (divisibleby5){
                        ans.add("Buzz");
                    } 
                    else{
                        ans.add(String.valueOf(i));
                    }
         }
                return ans;
    }
}