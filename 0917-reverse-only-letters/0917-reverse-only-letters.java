class Solution {
    public String reverseOnlyLetters(String s) {
       int l=0;
       int r=s.length()-1;
       StringBuffer sb=new StringBuffer(s);
       while(l<r){
        char a=sb.charAt(l);
        char b=sb.charAt(r);
        if(!Character.isLetter(a)|| !Character.isLetter(b)){
            if(!Character.isLetter(a))
            l++;
            else
            r--;
        }
        else{
            sb.setCharAt(l,b);
            sb.setCharAt(r,a);
            l++;
            r--;
        }
        
       } 
       return new String(sb);
    }
}