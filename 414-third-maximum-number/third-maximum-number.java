class Solution {
    public static int thirdMax(int[] nums) {
        // guard statements
        if (nums.length == 1) {return nums[0];}
        if (nums.length == 0) {return 0;}
        if (nums.length == 2) {
            if (nums[0] > nums[1]) {return nums[0];}
            else {return nums[1];}
        } 
        
        Integer maxNum = null;
        Integer secondMaxNum = null;
        Integer thirdMaxNum = null;
        for (Integer num : nums) {
            if (num.equals(maxNum) || num.equals(secondMaxNum)|| num.equals(thirdMaxNum)) {continue;}
            if (maxNum == null || num > maxNum) {
                thirdMaxNum = secondMaxNum;
                secondMaxNum = maxNum;
                maxNum = num;
            } else if (secondMaxNum == null || num > secondMaxNum) {
                thirdMaxNum = secondMaxNum;
                secondMaxNum = num;
            } else if (thirdMaxNum == null || num > thirdMaxNum) {
                thirdMaxNum = num;
            }
        }
        return (thirdMaxNum == null) ? maxNum : thirdMaxNum;
    }
    
}

