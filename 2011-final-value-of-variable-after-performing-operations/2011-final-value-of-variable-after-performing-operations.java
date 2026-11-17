class Solution {
    public int finalValueAfterOperations(String[] ops) {
        int n=ops.length;
        int X=0;
        for(int i=0;i<n;i++){
            if(ops[i].equals("++X") || ops[i].equals("X++")){
                X=X+1;
            }else if(ops[i].equals("--X") || ops[i].equals("X--")){
                X=X-1;
            }else{
                continue;
            }
        }
        return X;
    }
}