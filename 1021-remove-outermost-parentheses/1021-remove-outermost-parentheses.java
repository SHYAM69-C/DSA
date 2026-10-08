class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        StringBuilder result = new StringBuilder();
        int curr=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                curr++;
                if(curr > 1)
                 result.append(s.charAt(i));   
                
            } else{
                if(curr >1){
                    result.append(s.charAt(i));
                    curr--;
                } else{
                    curr--;
                }
            }
           
        }
        return result.toString();
    }
}