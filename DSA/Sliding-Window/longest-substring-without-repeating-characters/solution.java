class Solution {
    public int longestNonRepeatingSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left=0;
        int maxCount=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left++));
            }
            maxCount=Math.max(right-left+1,maxCount);
            set.add(s.charAt(right));
        }
        return maxCount;
    }
}