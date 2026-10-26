class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      int c=0;
      boolean l=false;
      for(int i=0;i<words.length;i++){
        for(int j=0;j<words[i].length();j++){
        if(allowed.contains(String.valueOf(words[i].charAt(j))))
        l=true;
        else{
            l=false;
            break;
        }
      }  
      if(l==true)
      c++;
      }
      return c;
    }
}