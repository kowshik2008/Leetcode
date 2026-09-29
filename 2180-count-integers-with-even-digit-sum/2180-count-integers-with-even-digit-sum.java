class Solution {
    public int countEven(int num) {
        int ar=0;
        int c=0;
        for(int i=1;i<num+1;i++){
            if(i%2==0 && i<10)
            c++;
            else{
                int temp=i;
                while(temp>0){
                    int d=temp%10;
                    ar+=d;
                    temp=temp/10;
                }
                if(ar%2==0)
                c++;
                else
                ar=0;
            }
        }
        return c;
    }
}