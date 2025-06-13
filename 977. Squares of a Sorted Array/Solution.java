class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length - 1, n = nums.length;
        ;
        int[] squares = new int[n];

        for (int m = n - 1; m >= 0; m--) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                squares[m] = nums[i] * nums[i];
                i++;
            } else {
                squares[m] = nums[j] * nums[j];
                j--;
            }
        }

        return squares;
    }
}
