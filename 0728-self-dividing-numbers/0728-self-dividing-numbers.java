class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       ArrayList<Integer> li=new ArrayList<>();
       for(int i=left;i<=right;i++){
        if(i<10)
        li.add(i);
        else{
            int temp=i;
            boolean flag=true;
            while(temp!=0){
                int d=temp%10;
                temp/=10;
                if(d==0){
                    flag=false;
                    break;
                }
                if(i%d!=0){
                    flag=false;
                }
            }
            if(flag==true)
            li.add(i);
        }
       } 
       return li;
    }
}