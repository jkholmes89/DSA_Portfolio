class Solution {
    public void duplicateZeros(int[] arr) {
        int counter = 0;
        while (counter < arr.length) {
            if (arr[counter] == 0) {
                insertZero(arr, counter);
                counter++;
            }
            counter++;
        }
    };

    public void insertZero(int[] arr, int index) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i-1];
        }
        if (index < arr.length -1) {
            arr[index+1] = 0;
        }
    };
}