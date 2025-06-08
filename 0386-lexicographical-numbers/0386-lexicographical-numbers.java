class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> resultvalue = new ArrayList<>();
        int current = 1;
        for(int i=1;i<=n;i++){
            resultvalue.add(current);
            
            if(current * 10 <= n ){
                current *=10;
            } else {
                while (current % 10 == 9 || current + 1>n){
                    current /=10;
                }
                current++;
            }
        }
        return resultvalue;
    }
}