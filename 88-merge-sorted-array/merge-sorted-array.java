class Solution {
            public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Count = m-1;
        int nums2Count = n-1;
        int sortIndex = (m + n) - 1;

        while (nums1Count >=0 && nums2Count >= 0) {
            if (nums1[nums1Count] > nums2[nums2Count]) {
                nums1[sortIndex] = nums1[nums1Count];
                nums1Count--;
            } else {
                nums1[sortIndex] = nums2[nums2Count];
                nums2Count--;
            }
            sortIndex--;
        }
        for (int i = nums1Count; i >= 0; i--) {
            nums1[sortIndex] = nums1[i];
            sortIndex--;
        }
        for (int i = nums2Count; i >=0; i--) {
            nums1[sortIndex] = nums2[i];
            sortIndex--;
        }
    }
}