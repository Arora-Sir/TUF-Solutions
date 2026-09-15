class Solution {
    public int kDistinctChar(String s, int k) {
        int maxLen = 0;  
        HashMap<Character,Integer> mpp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mpp.clear();
            for(int j=i;j<s.length();j++){
                char c=s.charAt(j);
                mpp.put(c,mpp.getOrDefault(c, 0)+1);
                if(mpp.size()<=k)
                    maxLen = Math.max(maxLen,j-i+1);
                else break;
            }
        }
        return maxLen;
    }
};