class Solution {
    public void reverseString(char[] s) {
        char aux;

        for (int i = 0; i < s.length / 2; i++) {
            aux = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = aux;
        }

        System.out.print("[");

        for (int i = 0; i < s.length; i++) {
            System.out.print("\"" + s[i] + "\"");
        }

        System.out.print("]");
    }
}
