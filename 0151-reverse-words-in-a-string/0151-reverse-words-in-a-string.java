class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        StringBuilder result = new StringBuilder();

        String[] word = s.trim().split("\\s+");
        System.out.print(Arrays.toString(word));
        for(int i=word.length-1;i>=0;i--){
           
            result.append(word[i]);
        if(i!=0){
            result.append(" ");
        }
        }
        return result.toString();
    }
}