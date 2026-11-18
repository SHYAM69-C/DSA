class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n=words.length;
        List<Integer> result=new ArrayList<>();
        int r=0;
        for(int i=0;i<n;i++){
         String w= words[i];
         int n2=w.length();
         for(int j=0;j<n2;j++){
            char ch=w.charAt(j);
            if(ch==x){
                result.add(r,i);
                break;
            }
         }

            
        }
        return result;
        
    }
}