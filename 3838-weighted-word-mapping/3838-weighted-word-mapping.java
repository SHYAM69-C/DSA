class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        int n=words.length;
        
        for(String word:words){
            int weightSum=0;
            for(int i=0;i<word.length();i++){
                char ch=word.charAt(i);
                int index=ch-'a';
                weightSum+=weights[index];
                            }
            int mappedValue = weightSum%26;
            char mappedChar = (char) ('z'-mappedValue);
            result.append(mappedChar);                
        }
        return result.toString();
    }
}