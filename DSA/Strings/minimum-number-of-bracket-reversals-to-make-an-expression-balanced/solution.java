class Solution {
    public int countRev(String s) {
        int n = s.length();
        if(n%2 != 0) return -1;
        int open = 0, close = 0;
        for(int i=0; i < n; i++) {
            if(s.charAt(i) == '(') open++;
            else {
                if(open > 0) open--;
                else close++;
            }
        }
        
        int ans = (open/2)+(open%2)+(close/2)+(close%2);
        return ans;
    }
}