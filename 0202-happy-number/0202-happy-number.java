class Solution {
    public boolean isHappy(int n) {
        Set<Integer> usedInteger =new HashSet<>(); 
        while(n!=1){
         if(usedInteger.contains(n)) return false;
         
        usedInteger.add(n);

        int sum=0;
       while(n>0){
        int digit = n%10;
         sum=(sum)+(digit*digit);
         n=n/10;
       } 
        n=sum;
       
       }   

    return true;
    }
}