class Solution {
    public int maxDifference(String s) {
     int n = s.length();
     int[] arr = new int[28];
     for(char c : s.toCharArray()){
        arr[c-'a']++;
     }   
     int minimum = n;
     int maximum =1;
     for(int i=0;i<27;i++){
        if(arr[i]==0){
            continue;
        }else if(arr[i]%2==0){
            minimum = Math.min(minimum,arr[i]);
        }else{
            maximum = Math.max(maximum,arr[i]);
        }
        
     }
        return maximum-minimum;
    }
}