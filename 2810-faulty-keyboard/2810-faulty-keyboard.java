class Solution {
    public String finalString(String s) {
        int n = s.length();
        StringBuilder result = new StringBuilder();
         StringBuilder res = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            result.append(ch);
            if(ch=='i'){
               result.reverse();
            }
         }
         System.out.print(result);
         for(int i=0;i<n;i++){
            char ch = result.charAt(i);
            if(ch=='i'){
                continue;
            } else{
                res.append(ch);
            }
         } 
        return res.toString();
    }
}