class Solution {
    public int countRev(String s) {
        int n = s.length();
        if(n%2 != 0) return -1; //odd length can never be balanced
        int open = 0, close = 0;
        // ")))(((" ; close:3 , open:3
        // Two opening "((" or closing "))" needs 1 reversal each
        // One closing & opening needs 1 reversal each
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