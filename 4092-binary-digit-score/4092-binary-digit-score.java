class Solution {
    public int calculateScore(int a, int b) {
        int su=0;
        int d=0;
        int s1=0;
        int s2=0;
        while(a>0 || b>0){
            if(a>0){
            d=a%2;
            s1+=d;
            a=a/2;
            }
            if(b>0){
                su=b%2;
                s2+=su;
                b/=2;
            }
        }
        if(s1>=s2)
        return s1*s2;
        return s2/s1;
    }
}