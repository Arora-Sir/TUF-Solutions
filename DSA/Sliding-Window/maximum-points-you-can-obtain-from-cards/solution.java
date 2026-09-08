class Solution {
    public int maxScore(int[] cardScore, int k) {
        int i=0,j=cardScore.length-1;
        int ans=0;
        int curr = 0;
        for(i=0; i<k;i++) curr+=cardScore[i];
        ans=curr;
        i--;
        for(int l=0; l<k;l++) {
            curr = curr-cardScore[i]+cardScore[j];
            ans = Math.max(curr,ans);
            i--;j--;
        }
        return ans;
    }
}