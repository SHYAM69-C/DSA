class Solution {
    public String largestGoodInteger(String num) {
      int n= num.length();
      String largest="";
      
      Set<String> result = new HashSet<>();
      result.add("999"); result.add("888");result.add("777");result.add("666");result.add("555");result.add("444");result.add("333");result.add("222");result.add("111"); result.add("000");
          
          
            for (int i = 0; i <= n - 3; i++) {
            String temp = num.substring(i, i + 3);

            if (result.contains(temp)) {
                if (largest.equals("") || temp.compareTo(largest) > 0) {
                    largest = temp;
                }
            }
        }

        return largest;
    
    }
}