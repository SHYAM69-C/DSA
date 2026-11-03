class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[]res=new int[n];
        int[]res1=new int[n];
        int[]res2=new int[n];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                res1[j++]=nums[i];
            }else{
                res2[k++]=nums[i];
            }
        }
        for(int i=0;i<j;i++){
            res[i]=res1[i];
        }
        for(int i=0;i<k;i++){
            res[j+i]=res2[i];
        }
       return res; 
    }
}