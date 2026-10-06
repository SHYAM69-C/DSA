class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        int curr=0;
        int depth=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                curr++;
               
            } else if(ch==')'){
                if(curr >0){
                    curr--;
                }else{
                    depth++;
                }
            }else{
                continue;
            }
        }
        return curr+depth;
    }
}