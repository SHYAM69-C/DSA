class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int[]moves=new int[n];
        Arrays.sort(nums);
        int j=0;
        
        for(int i=0;i<n;i++){
         int min=nums[0];
          moves[j++]=nums[i]-min;

        }
        int sumMoves=0;
        for(int i=0;i<n;i++){
          sumMoves+=moves[i];
        }   

        return sumMoves;   
    }
}