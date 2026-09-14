class Solution {
    public String removeDuplicateLetters(String s) {

        int[] count = new int[26];
        boolean[] visited = new boolean[26];

        // Count frequency
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {

            int index = ch - 'a';
            count[index]--;

            // Already present
            if (visited[index]) {
                continue;
            }

            // Remove bigger characters if they appear later
            while (stack.length() > 0 &&
                   stack.charAt(stack.length() - 1) > ch &&
                   count[stack.charAt(stack.length() - 1) - 'a'] > 0) {

                char removed = stack.charAt(stack.length() - 1);

                stack.deleteCharAt(stack.length() - 1);
                visited[removed - 'a'] = false;
            }

            stack.append(ch);
            visited[index] = true;
        }

        return stack.toString();
    }
}