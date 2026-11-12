class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
      Set<Integer>set=new HashSet<>();
      for(int friend:friends){
      set.add(friend);
      }
      List<Integer> result = new ArrayList<>();
      for(int id:order){
        if(set.contains(id)){
            result.add(id);
        }
      } 
      return result.stream().mapToInt(i->i).toArray();
    }
}