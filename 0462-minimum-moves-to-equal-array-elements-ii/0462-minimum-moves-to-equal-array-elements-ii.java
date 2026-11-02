class Solution {
    public int minMoves2(int[] nums) {
       int n=nums.length;
       Arrays.sort(nums);
       int res=0;
       int mid=n/2;
       for(int i=0;i<n;i++){
            if(i<mid){
                res+=nums[mid]-nums[i];
            }else{
                res+=nums[i]-nums[mid];
            }
       } 
       return res;
    }
}