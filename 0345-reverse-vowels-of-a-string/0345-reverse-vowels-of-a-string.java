class Solution {
    public String reverseVowels(String s) {
      int n=s.length();
      StringBuilder result = new StringBuilder();
      StringBuilder res = new StringBuilder();
      int resultIndex=0;
      for(int i=0;i<n;i++){
        char ch = s.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
            result.append(ch);
        } else{
            continue;
        }
      }
      result.reverse();
      System.out.print(result);
      for(int i=0;i<n;i++){
        char ch = s.charAt(i);
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
           res.append(result.charAt(resultIndex));
            resultIndex++;

      } else {
        res.append(s.charAt(i));
      }  

      } 
      return res.toString();
      
    }
}