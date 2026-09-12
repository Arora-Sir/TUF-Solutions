class Solution {
  public int totalFruits(int[] fruits) {
    HashMap<Integer,Integer> map = new HashMap<>();
    int left=0,ans=0;
    for(int right=0;right<fruits.length;right++){
      map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
      while(map.size()>2){
        map.put(fruits[left],map.get(fruits[left])-1); //as contigious array we want and we can't pick more than 2 types of fruit we must empty the first basket we filled
        if(map.get(fruits[left])==0) map.remove(fruits[left]);
        left++;
      }
      ans = Math.max(ans,right-left+1);
    }
    return ans;
  }
}
