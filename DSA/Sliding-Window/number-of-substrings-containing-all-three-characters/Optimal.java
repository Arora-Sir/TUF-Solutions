class Solution {    
    public int numberOfSubstrings(String s) { //O(n) Sliding Window 
        int count=0; 
        int[] lastSeen=new int[]{-1,-1,-1};
        for(int i=0;i<s.length();i++){ 
            lastSeen[s.charAt(i)-'a']=i; //storing the index of that character in lastSeen array
            if(lastSeen[0]!=-1 && lastSeen[1]!=-1 && lastSeen[2]!=-1){
              count+=1+Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2])); //this+all previous than minimum index where first char is found
          }
        }
        return count;
    }
}