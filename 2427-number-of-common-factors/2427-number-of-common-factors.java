class Solution {
    public int commonFactors(int a, int b) {
     int c=0;
     for(int i=1;i<1001;i++){
        if(a%i==0 && b%i==0)
        c++;
        if(a<i || b<i)
        break;
     }  
     return c;
    }
}