class Solution {
    public int hammingWeight(int n) {
        int bits = 0;
        int lastBit = 0;
        while (n > 0) {
            if ((n & 1) == 1)
                bits++;
            n = n >> 1;
        }
        return bits;
    }
}
