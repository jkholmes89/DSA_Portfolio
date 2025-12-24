class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int midIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                return false;
            }
            if (arr[i] == arr[i+1]) {
                return false;
            } else if (arr[i] > arr[i+1]) {
                midIndex = i;
                break;
            }
        }

        if (midIndex == 0) {
            return false;
        }
        for (int i = midIndex + 1; i <arr.length; i++) {
            if (arr[i] >= arr[i-1]) {
                return false;
            }
        }

        return true;
    }
}