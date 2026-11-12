class Solution {
    public int longestMonotonicSubarray(int[] nums) {
       int n=nums.length;
       if(n==0) return 0;
       int maxLength=1;
       int incCount=1;
       int decCount=1;
    
       for(int i=1;i<n;i++){
        if(nums[i]>nums[i-1]){
            incCount++;
            decCount=1;
        }
        else if(nums[i]<nums[i-1]){
            decCount++;
            incCount=1;
        }
        else{
            incCount=1;
            decCount=1;
        }
        maxLength=Math.max(maxLength,Math.max(incCount,decCount));
       } 
       return maxLength;
    }
}