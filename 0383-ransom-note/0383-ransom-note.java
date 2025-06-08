class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>MagazineLetters = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char m = magazine.charAt(i);

            int currentcount = MagazineLetters.getOrDefault(m,0);
            MagazineLetters.put(m,currentcount+1);
        }
            for(int j=0;j<ransomNote.length();j++){
                char r = ransomNote.charAt(j);

                int currentcount = MagazineLetters.getOrDefault(r,0);
            
            if(currentcount==0){
                return false;
            }
            MagazineLetters.put(r,currentcount-1);
            }
        return true;
    }
}