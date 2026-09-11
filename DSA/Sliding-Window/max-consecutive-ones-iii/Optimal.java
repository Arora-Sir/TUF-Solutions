class Solution {
  public int longestOnes(int[] nums, int k) {
    int n = nums.length;
    int left=0,right=0; //Sliding window statergy: O(n): moving left and right together at a point when zeros are greater than k till we are getting either the less zeros or the maxlen already bigger than the sliding window, and the algo will stop, try it with this eg: [1 1 1 1 1 0 0 0] & k=2
    int zerosCount = 0, maxLen = 0;
    while (right<n) {
      if(nums[right]==0) zerosCount++;
      if(zerosCount>k){ //! Update: Not while here
        if(nums[left]==0) zerosCount--;
        left++;
      }
    //   if(zerosCount<=k){ //adding if condition so only update ehn less than k
        int currLen=right-left+1;
        maxLen=Math.max(maxLen,currLen);
      }
      right++;
    }
    return maxLen;
  }
}