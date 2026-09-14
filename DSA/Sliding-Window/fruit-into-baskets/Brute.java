class Solution {
    public int totalFruits(int[] fruits) {
        int max=0;
        for(int i=0;i<fruits.length;i++){
            Set<Integer> set = new HashSet<>();
            int curr =0;
            for(int j=i;j<fruits.length;j++){
                set.add(fruits[j]);
                if(set.size()<=2) curr++;
                else break;
                max = Math.max(curr,max);
            }
        }
        return max;
    }
}