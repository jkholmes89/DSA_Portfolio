class Solution {
    public int findNumbers(int[] nums) {
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
        int digitCount = 1;
        int num = nums[i];        
        while (num > 9) {
            digitCount++;
            num = num / 10;
        }
        if (digitCount % 2 == 0) {
            count++;
        }
    }
    return count;
    }
}