class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);

        int n = arr1.length;
        int m = arr2.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int left = lowerBound(arr2, arr1[i] - d);

            if (left < m && Math.abs(arr2[left] - arr1[i]) <= d) {
                continue;
            }
            else if (left > 0 && Math.abs(arr2[left - 1] - arr1[i]) <= d) {
                continue;
            }
            else {
                count++;
            }
        }

        return count;
    }

    public int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}