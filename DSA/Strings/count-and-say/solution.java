class Solution {
  public String countAndSay(int n) {
    String ans = "1";
    for (int i = 1; i < n; i++) {
      String tempAns = ans; //last string answer
      int tempLen = tempAns.length();
      ans = "";
      int count = 1;
      for (int j = 0; j < tempLen-1; j++) {
        if (tempAns.charAt(j)==tempAns.charAt(j+1)) count++;
        else {
          ans += count+""+tempAns.charAt(j);
          count = 1;
        }
      }
      ans += count+""+tempAns.charAt(tempLen-1); //last char save & final answer also ; count will be correct as we started from 1 already
    }
    return ans;
  }
}
