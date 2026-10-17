class Solution {
    public String reverseWords(String s) {
      String[] arr=s.split(" ");
      String v="";
      for(int i=0;i<arr.length;i++){
        StringBuffer d=new StringBuffer(arr[i]);
        d.reverse();
        v+=d;
        if(i!=arr.length-1)
        v+=" ";
      }
    //   for(int i=0;i<s.length();i++){
    //     if(s.charAt(i)==' '){
    //         d.reverse();
    //         v+=d;
    //     }
    //     else
    //     d=s.charAt(i);
    //   }
      return v;
    }
}