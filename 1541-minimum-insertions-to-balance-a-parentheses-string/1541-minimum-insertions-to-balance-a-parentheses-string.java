class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        int curr=0;
        int insertion=0;
        int result=0;
        
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            if(ch=='('){
                curr++;
            } else {
             
                    if((i+1) <n && s.charAt(i+1)==')'){
                    i++;
                    
                } else{
                    insertion++;
                }
                if(curr >0){
                    curr--;
                } else{
                   insertion++; 
                }
            }
        }
        insertion += curr*2;
        return insertion;
    }
}