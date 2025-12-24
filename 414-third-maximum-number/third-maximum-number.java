class Solution {
    public static int thirdMax(int[] nums) {
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

