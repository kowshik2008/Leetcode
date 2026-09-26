class Solution {
    public long sumAndMultiply(int n) {
       long sum=0;
       long o=0;
       String v=String.valueOf(n);
       for(int i=0;i<v.length();i++){
        if(v.charAt(i)-'0'!=0){
            sum=(sum*10)+v.charAt(i)-'0';
            o+=v.charAt(i)-'0';
        }
       }
       return sum*o;
    }
}