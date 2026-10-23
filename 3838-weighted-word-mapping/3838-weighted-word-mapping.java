class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
      String s="";
      int n=0;
      int e=0;
      for(int i=0;i<words.length;i++){
        e=0;
        for(int j=0;j<words[i].length();j++){
           n=25+words[i].charAt(j)-122; 
           e+=weights[n];
        }
        
        e=122-(e%26);
        s+=(char)e;
      }  
      return s;
    }
}