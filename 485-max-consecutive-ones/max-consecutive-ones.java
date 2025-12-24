class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curCount = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                curCount++;
            } else {
                maxCount = (curCount > maxCount) ? curCount : maxCount;
                curCount = 0;
            }
        }
        maxCount = (curCount > maxCount) ? curCount : maxCount;
        return maxCount;
    }
}