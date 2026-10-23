class Solution {
    public boolean isAcronym(List<String> words, String s) {
        boolean f=false;
      if(words.size()==s.length()){
        for(int i=0;i<words.size();i++){
            if((words.get(i)).charAt(0)==s.charAt(i))
            f=true;
            else return false;
        }
      } else return false;
      return true; 
    }
}