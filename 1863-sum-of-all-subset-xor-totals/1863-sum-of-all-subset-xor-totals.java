class Solution {
    private int totalSum=0;

    public int subsetXORSum(int[] nums) {
        calculateXOR(0,0,nums);
        return totalSum;
        
    }

    private void calculateXOR(int index,int currentXOR,int []nums){
        if(index==nums.length){
            totalSum+=currentXOR;
            return;
        }

        calculateXOR(index+1,currentXOR ^nums[index],nums);
        calculateXOR(index+1,currentXOR,nums);
    }
}