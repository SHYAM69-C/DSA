
class Solution {
    public int calPoints(String[] ops) {
        int n = ops.length;
        int[] res = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) {
            if (ops[i].equals("C")) {
                size--;
            } else if (ops[i].equals("D")) {
                res[size] = res[size - 1] * 2;
                size++;
            } else if (ops[i].equals("+")) {
                res[size] = res[size - 2] + res[size - 1];
                size++;
            } else {
                res[size] = Integer.parseInt(ops[i]);
                size++;
            }
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += res[i];
        }

        return sum;
    }
}
