class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {return nums;}
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        int temp;

        while (rightIndex - leftIndex > 0) {
            if (nums[leftIndex] % 2 == 0) {
                leftIndex++;
            } else {
                temp = nums[rightIndex];
                nums[rightIndex] = nums[leftIndex];
                nums[leftIndex] = temp;
                rightIndex--;
            }
        }
        return nums;
    }
}