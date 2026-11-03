class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int res=0;
        for(int i=0;i<n;i++){
           int max=nums[n-1];
            res+=max-nums[i];
        }
       return res;
    }
}