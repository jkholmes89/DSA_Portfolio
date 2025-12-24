class Solution {
        public static int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int[] sorted = new int[nums.length];
        int sortEnd = end;

        while (end - start >= 0) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])) {
                sorted[sortEnd] = nums[start] * nums[start];
                start++;
                sortEnd--;
            } else {
                sorted[sortEnd] = nums[end] * nums[end];
                end--;
                sortEnd--;
            }
        }
        return sorted;
    }
}