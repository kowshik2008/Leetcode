class Solution {
    public int countKeyChanges(String s) {
      String v=s.toLowerCase();
      int c=0;
      for(int i=0;i<s.length()-1;i++){
        if(v.charAt(i)!=v.charAt(i+1))
        c++;
      }   
      return c;   
    }
}