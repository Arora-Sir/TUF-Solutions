class Solution {
    public int kDistinctChar(String s, int k) {
        int maxLen=0,left=0;
        HashMap<Character,Integer> mpp = new HashMap<>();
        for(int right=0;right<s.length();right++){
            char currChar=s.charAt(right);
            mpp.put(currChar,mpp.getOrDefault(currChar,0)+1); 
            if(mpp.size()>k){
                char leftChar=s.charAt(left++);
                mpp.put(leftChar,mpp.get(leftChar)-1);
                if(mpp.get(leftChar)==0) mpp.remove(leftChar);
            }
            if(mpp.size()<=k)
                maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
};