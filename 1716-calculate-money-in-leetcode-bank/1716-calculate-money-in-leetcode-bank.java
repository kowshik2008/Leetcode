class Solution {
    public int totalMoney(int n) {
     int sum=0;
     int c=0;
     for(int i=1;i<=n;i++){
        if(i%7!=0)
        sum+=i%7+c;
        else{
            sum+=7+c;
            c++;
        }
     }   
     return sum;
    }
}