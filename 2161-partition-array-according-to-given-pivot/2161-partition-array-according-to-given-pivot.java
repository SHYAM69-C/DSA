class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int [] ans =new int[n];
        int cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                ans[cnt]=nums[i];
                cnt++;
            }
        }   
        System.out.println(Arrays.toString(ans));
        for(int i=0;i<n;i++){
            if(nums[i]==pivot){
                ans[cnt]=nums[i];
                cnt++;
            }    
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                ans[cnt]=nums[i];
                cnt++;
            }    
        }
        return ans;
    }
}