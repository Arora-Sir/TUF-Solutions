class Solution {    
    public int numberOfSubstrings(String s) { //O(n^2)
        int count=0; 
        for(int i=0;i<s.length();i++){
          int[] arrayOfAll=new int[3]; 
          for(int j=i;j<s.length();j++){
            arrayOfAll[s.charAt(j)-'a']=1; //as we have only a,b,c as charachters so it will be not an issue!
            if(arrayOfAll[0]+arrayOfAll[1]+arrayOfAll[2]==3)
              count++;
          }
        }
        return count;
    }
}