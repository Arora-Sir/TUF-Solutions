class Solution {
  public int longestOnes(int[] nums, int k) {
    int n = nums.length;
    int left=0,right=0; //Sliding window statergy: O(2n)
    int zerosCount = 0, maxLen = 0;
    while (right<n) {
      if(nums[right]==0) zerosCount++;
      while(zerosCount>k){ //so to come in the range of k
        if(nums[left]==0) zerosCount--;
        left++;
      }
      int currLen=right-left+1;
      maxLen=Math.max(maxLen,currLen);
      right++;
    }
    return maxLen;
  }
}