class Solution {
    public int minInsertions(String s) {
       int n=s.length();
       int open=0;
       int insert=0;
       for(int i=0;i<n;i++){
        char ch = s.charAt(i);
        if(ch=='('){
            open++;
        } else {
            if(i+1<n && s.charAt(i+1)==')'){
                i++;
            }else{
                insert++;
            }
            if(open >0){
                open--;
            } else{
                insert++;
            }
        }
       } 
       insert += open*2;
       return insert;
    }
}