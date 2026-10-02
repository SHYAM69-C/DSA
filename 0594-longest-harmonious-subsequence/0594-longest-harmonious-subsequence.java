class Solution {
    public int findLHS(int[] nums) {
      HashMap<Integer, Integer> set = new HashMap<>();

        for (int num : nums) {
            set.put(num, set.getOrDefault(num, 0) + 1);
        }

        int max = 0;

        for (int num : set.keySet()) {
            if (set.containsKey(num + 1)) {
                max = Math.max(max, set.get(num) + set.get(num + 1));
            }
        }

        return max;
    }
}