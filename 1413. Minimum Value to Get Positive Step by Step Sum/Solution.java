class Solution {
    public int minStartValue(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int startValue = prefix[0];
        for (int i = 1; i < prefix.length; i++) {
            if (prefix[i] < startValue) {
                startValue = prefix[i];
            }
        }

        if (startValue >= 0)
            return 1;

        return startValue * -1 + 1;
    }
}
