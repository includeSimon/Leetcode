class Solution {

    public String reverseWords(String s) {
        int lastSpaceIndex = -1;
        char[] chArray = s.toCharArray();
        int len = s.length();

        for (int i = 0; i <= len; i++) {
            if (i == len || chArray[i] == ' ') {
                int left = lastSpaceIndex + 1;
                int right = i - 1;
                while (left < right) {
                    char temp = chArray[left];
                    chArray[left] = chArray[right];
                    chArray[right] = temp;
                    left++;
                    right--;
                }
                lastSpaceIndex = i;
            }
        }
        return new String(chArray);
    }

}
