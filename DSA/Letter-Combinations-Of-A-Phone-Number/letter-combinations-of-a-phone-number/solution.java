
class Solution {
    private final String[] map = new String[]{"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; //2 to 9
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0 ) return ans;
        letterCombinationsHelper(0,"",digits, ans);
        return ans;
    }
    private void letterCombinationsHelper(int index, String currentStr, String digits, List<String> ans){
        if (index == digits.length()) {
            ans.add(currentStr);
            return;
        } 

        String subStr = map[digits.charAt(index)-'0']; 
        for (int i = 0; i < subStr.length(); i++)
            letterCombinationsHelper(index+1,currentStr+subStr.charAt(i),digits,ans);
    }
}