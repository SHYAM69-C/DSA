class Solution {
    public int distributeCandies(int[] can) {
        Arrays.sort(can);
        int n=can.length;
        int [] res = new int[n];
        int j=0;
        for(int i=1;i<n;i++){
            if(can[i-1]!=can[i]){
                res[j++]=can[i-1];
            } 
            
        }
        res[j++]=can[n-1];
        System.out.print(Arrays.toString(res));
        
        return Math.min(j,n/2);
    }
}