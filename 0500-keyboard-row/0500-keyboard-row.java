class Solution {
    public String[] findWords(String[] words) {

        int n = words.length;
        String letter = "qwertyuiop asdfghjkl zxcvbnm";
        String[] key = letter.split("\\s+");

        String[] result = new String[n];
        int count = 0;

        for (int i = 0; i < n; i++) {

            String word = words[i].toLowerCase();
            boolean valid = false;

            for (int k = 0; k < key.length; k++) {

                if (key[k].indexOf(word.charAt(0)) != -1) {
                    valid = true;

                    for (int j = 1; j < word.length(); j++) {
                        if (key[k].indexOf(word.charAt(j)) == -1) {
                            valid = false;
                            break;
                        }
                    }

                    break;
                }
            }

            if (valid) {
                result[count++] = words[i];
            }
        }

        return Arrays.copyOf(result, count);
    }
}