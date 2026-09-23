class Solution {
    public String minWindow(String s, String t) { //v7
        if(s.length()<t.length()) return "";
        int[] freq=new int[256];
        for(char c:t.toCharArray()) freq[c]++;
        int minLen=Integer.MAX_VALUE;
        int sIndex=-1, count=0, left=0;
        for(int right=0;right<s.length();right++){
            if(freq[s.charAt(right)]>0) count++;
            freq[s.charAt(right)]--;
            while(count==t.length()){
                if(right-left+1<minLen){
                    minLen=right-left+1;
                    sIndex=left;
                }
                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)]>0) count--; //if after adding the left char making it more than 0 that means it was not a surplus and the loop breaks and will found in another loop
                left++;
            }
        }
        return (sIndex==-1)?"":s.substring(sIndex,sIndex+minLen);
    }
}

