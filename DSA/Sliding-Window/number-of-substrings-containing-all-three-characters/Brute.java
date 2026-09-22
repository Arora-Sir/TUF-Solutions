class Solution {    
    public int numberOfSubstrings(String s) { //O(n^3) 
        int count=0; 
        for(int i=0;i<s.length();i++){ 
          for(int j=i;j<s.length();j++){
            Set<Character> setOfAll = new HashSet<Character>();
            int internalCount =0;
            for(int k=i;k<=j;k++){
              if((s.charAt(k)=='a' || s.charAt(k)=='b' || s.charAt(k)=='c') && !setOfAll.contains(s.charAt(k))){
                internalCount++;
                setOfAll.add(s.charAt(k));
              }
              if(internalCount==3) {
                count++;
                break;
              }
            }
          }
        }
        return count;
    }
}