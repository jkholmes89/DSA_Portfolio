class Solution {
        public int heightChecker(int[] heights) {
            if (heights.length == 0 || heights.length == 1) {return 0;}

            int errs = 0;
            int[] sortedHeights = quickSortIntegers(heights);

            for (int i = 0; i<heights.length; i++) {
                if (heights[i] != sortedHeights[i]) {
                    errs++;
                }
            }
            return errs;
    }

    private int[] quickSortIntegers(int[] nums) {
        int[] left = new int[nums.length / 2];
        int leftInd = 0;
        int[] right = new int[nums.length - left.length];
        int rightInd = 0;
        int[] sorted = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i < left.length) {
                left[leftInd] = nums[i];
                leftInd++;
            } else {
                right[rightInd] = nums[i];
                rightInd++;
            }
        }
        
        if (left.length > 1) {
            left = quickSortIntegers(left);
        }
        if (right.length > 1) {
            right = quickSortIntegers(right);
        }

        leftInd = 0;
        rightInd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftInd >= left.length) {
                sorted[i] = right[rightInd];
                rightInd++;
            } else if (rightInd >= right.length) {
                sorted[i] = left[leftInd]; 
                leftInd++;
            } else if (left[leftInd] < right[rightInd]) {
                sorted[i] = left[leftInd];
                leftInd++;
            } else {
                sorted[i] = right[rightInd];
                rightInd++;
            }
        }
        return sorted;
    }
}