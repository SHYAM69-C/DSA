class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int nums[] = new int[arr.length];
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;
         System.out.println(min);
        for (int i = 0; i < arr.length - 1; i++) {
            nums[i] = Math.abs(arr[i + 1] - arr[i]);
            min = Math.min(min, nums[i]);
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (nums[i] == min) {
                result.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return result;
    }
}