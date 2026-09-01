class Solution {
    public String reverseWords(String s) {
        String ans = "";
        int i = s.length() - 1; //using 2 pointer approach from the end (i,j pointing to the last characher)

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            if (i < 0) break; //base case string starting

            int j = i;
            while (i >= 0 && s.charAt(i) != ' ') i--;

            if (!ans.isEmpty()) ans += " ";
            ans += s.substring(i + 1, j + 1); //inclusive,exclusive
        }

        return ans;
    }
}
