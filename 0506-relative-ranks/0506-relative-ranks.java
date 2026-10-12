

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] res = new String[n];

        Integer[] indices = new Integer[n];

        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> score[b] - score[a]);

        for (int i = 0; i < n; i++) {
            int idx = indices[i];

            if (i == 0) {
                res[idx] = "Gold Medal";
            } else if (i == 1) {
                res[idx] = "Silver Medal";
            } else if (i == 2) {
                res[idx] = "Bronze Medal";
            } else {
                res[idx] = String.valueOf(i + 1);
            }
        }

        return res;
    }
}