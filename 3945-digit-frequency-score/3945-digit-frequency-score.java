class Solution {
    public int digitFrequencyScore(int n) {
      String g="";
      g+=n;
      int sum=0;
      for(int i=0;i<g.length();i++){
        sum+=g.charAt(i)-'0';
      } 
      return sum; 
    }
}