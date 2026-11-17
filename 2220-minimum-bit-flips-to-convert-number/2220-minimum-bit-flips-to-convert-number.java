class Solution {
    public int minBitFlips(int start, int goal) {
      int d=goal^start;
      int x=0;
      while(d!=0){
        int y=d%2;
        x+=y;
        d=d/2;
      }
  return x;
    }
}