class Solution {
    public boolean isValid(String s) {
       Stack<Character> t=new Stack<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
        t.push(s.charAt(i));  
        else{
            if(t.isEmpty())
            return false;
            char p=t.pop();
            if((s.charAt(i)==')' && p!='(') || (s.charAt(i)==']' && p!='[' )|| (s.charAt(i)=='}' && p!='{'))
            return false;
        }
       } 
       
       return t.isEmpty();
    }
}