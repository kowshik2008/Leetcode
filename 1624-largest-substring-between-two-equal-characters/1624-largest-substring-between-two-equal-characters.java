class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        // if(s.charAt(0)==s.charAt(s.length()-1))
        // return(s.length()-2);
        // // return -1;
         int c=-1;
        int max=-1;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                c=j-i-1;
                if(c>max)
                max=c;
                }
            }
        }
        // if(sum==0)
        // return -1;
        // return(s.length()-sum);
        // StringBuffer v=new StringBuffer(s);
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==s.charAt(s.length()-1-i)){
        //         return(s.length()-1-i-1);
                
        //     }
            // for(int j=i+1;j<v.length();j++){
            //     if(s.charAt(i)==s.charAt(j)){
            //         v.delete(i,i+1);
            //         v.delete(j,j+1);
            //     }
            // }
        
        
        return max;
        }//return c;
    }
