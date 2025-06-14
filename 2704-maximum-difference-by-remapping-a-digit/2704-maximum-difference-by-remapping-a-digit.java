class Solution {
    public int minMaxDifference(int num) {
        String original = String.valueOf(num);

        char firstNon9 = '9';
        for (char c : original.toCharArray()) {
            if (c != '9') {
                firstNon9 = c;
                break;
            }
        }

        String maxString = original.replace(firstNon9, '9');
        int maxVal = Integer.parseInt(maxString);

        char firstChar = original.charAt(0);
        String minString = original.replace(firstChar, '0');
        int minVal = Integer.parseInt(minString);

        return maxVal - minVal;
    }
}
