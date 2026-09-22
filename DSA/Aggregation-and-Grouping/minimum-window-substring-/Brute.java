class Solution {
    public String minWindow(String s, String t) {
        int minLen=Integer.MAX_VALUE;
        int sIndex=-1;
        int[] targetFreq=new int[256];
        for(char c:t.toCharArray()){
            targetFreq[c]++;
        }
        for(int i=0;i<s.length();i++){
            int[] hash=targetFreq.clone(); //cloning is better as we just copy max 256 chars instead of the comple t size()
            int count=0;
            for(int j=i;j<s.length();j++){
                if(hash[s.charAt(j)]>0) count++;
                hash[s.charAt(j)]--;
                if(count==t.length()){
                    if(j-i+1<minLen){
                        minLen=j-i+1;
                        sIndex=i;
                    }
                    break;
                }
            }
        }
        return (sIndex==-1)?"":s.substring(sIndex,sIndex+minLen);
    }
}