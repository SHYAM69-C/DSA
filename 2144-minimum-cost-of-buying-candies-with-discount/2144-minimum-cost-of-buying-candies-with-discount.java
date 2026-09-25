class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        for(int i=0;i<cost.length/2;i++){
            int temp=cost[i];
            cost[i]=cost[cost.length-1-i];
            cost[cost.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(cost));
        int sum=0;
        
        for(int i=1;i<=cost.length;i++){
           
        if(i%3==0) continue;

        sum=sum+cost[i-1];

    }
    return sum;
    }
}