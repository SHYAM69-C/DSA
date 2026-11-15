class Solution {
    public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        int oddCount=0;
        int evenCount=1;
        int currentSum=0;
        int result=0;
        int MOD = 1000000007;
        for(int i=0;i<n;i++){
            currentSum+=arr[i];
            if(currentSum%2!=0){
                result=(result+evenCount)%MOD;
                oddCount++;
            }else{
                result=(result+oddCount)%MOD;
                evenCount++;
            }
        }
        return result;
    }
}