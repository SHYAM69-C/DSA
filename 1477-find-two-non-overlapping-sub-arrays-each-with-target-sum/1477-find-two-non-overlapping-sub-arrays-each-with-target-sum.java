class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int INF = Integer.MAX_VALUE;
        int[] dp = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            dp[i] = INF;
        }

        java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
        map.put(0, 0);

        int prefix = 0;
        int ans = INF;

        for (int i = 1; i <= n; i++) {
            prefix += arr[i - 1];

            dp[i] = dp[i - 1];

            if (map.containsKey(prefix - target)) {
                int start = map.get(prefix - target);
                int len = i - start;

                if (dp[start] != INF) {
                    ans = Math.min(ans, len + dp[start]);
                }

                dp[i] = Math.min(dp[i], len);
            }

            map.put(prefix, i);
        }

        return ans == INF ? -1 : ans;
    }
}