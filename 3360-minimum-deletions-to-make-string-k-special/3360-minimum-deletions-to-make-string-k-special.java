class Solution {
    public int minimumDeletions(String word, int k) {
        int []fre = new int[26];
        for(char ch : word.toCharArray()){
            fre[ch-'a']++;
        }

        int[] updated = new int[26];
        int size = 0;
        for (int f:fre){
            if(f>0) updated[size++] = f;
        }

        Arrays.sort(updated,0,size);

        int min = Integer.MAX_VALUE;
        int totalsum = word.length();
        int deletedleftsum = 0;
        int suminwindow = 0;
        int j = 0;

        for(int i=0;i<size;i++) {
            int from = updated[i];
            int to = from+k;

            while (j<size && updated[j]<= to){
                suminwindow += updated[j++];
            }

            int countright = size - j;
            int sumright  = totalsum  - suminwindow;

            int deletionsright = sumright - countright * to;
            int totaldel = deletedleftsum + deletionsright;
            min = Math.min(min,totaldel);

            totalsum -=updated[i];
            deletedleftsum+=updated[i];
            suminwindow -= updated[i];

        }
        return min;
    }
}