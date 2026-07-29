class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> currentList = new ArrayList<>();
        dfs(0, s, currentList, ans);
        return ans;
    }

    private void dfs(int index, String s, List<String> currentList, List<List<String>> ans) {
        if (index == s.length()) {
            ans.add(new ArrayList<>(currentList));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                currentList.add(s.substring(index, i + 1)); // [)
                dfs(i + 1, s, currentList, ans);
                currentList.remove(currentList.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
};
