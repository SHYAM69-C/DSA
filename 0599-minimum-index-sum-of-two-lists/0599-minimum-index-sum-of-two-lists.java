class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int n1=list1.length;
        int n2=list2.length;
        String[] lis = new String[n1+n2];
        int k=0;
         int min=Integer.MAX_VALUE;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
               
                if(list1[i].equals(list2[j])){
                     if(i+j<min){
                        min=i+j;
                        k=0;
                    lis[k++]=list1[i];
                    
                     } else if(i+j==min){
                        lis[k++]=list1[i];
                     }
                     break;
                }
            }
        }
        return Arrays.copyOf(lis,k);
    }
}