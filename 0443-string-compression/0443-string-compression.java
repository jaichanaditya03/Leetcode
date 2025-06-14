class Solution {
    public int compress(char[] chars) {
        int write = 0; 
        int anchor = 0; 

        for (int read = 0; read < chars.length; read++) {
            
            if (read + 1 == chars.length || chars[read] != chars[read + 1]) {
                chars[write++] = chars[anchor]; 
                int count = read - anchor + 1;
                if (count > 1) {
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[write++] = c; 
                    }
                }
                anchor = read + 1; 
            }
        }

        return write; 
    }
}
