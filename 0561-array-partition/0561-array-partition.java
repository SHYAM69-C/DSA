class Solution {
    public int arrayPairSum(int[] nums) {
      int n=nums.length;
      Arrays.sort(nums);
      int res[]=new int[n];
      int sum=0;
      int min=0;
      int j=0;
      for(int i=0;i<n;i++){
        if(i<n-2){
         min=Math.min(nums[i],nums[i+1]);
            res[j++]=min;
            i++;
        
      }
      }
      res[j++]=nums[n-2];
       for(int i=0;i<n;i++){
        sum+=res[i];
       } 
       return sum;
    }
}