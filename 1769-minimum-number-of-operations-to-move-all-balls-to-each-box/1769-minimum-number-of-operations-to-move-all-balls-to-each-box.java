class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int result[]=new int[n];
        int leftCount=0;
        int moves=0;
        for(int i=0;i<n;i++){
           result[i]+=moves;
           if(boxes.charAt(i)=='1'){
            leftCount++;
           }
           moves += leftCount;
        }
        int rightCount=0;
        moves=0;
        for(int i=n-1;i>=0;i--){
            result[i] +=moves;
            if(boxes.charAt(i)=='1'){
                rightCount++;
            }
            moves += rightCount;
        }
    return result;
    }
}