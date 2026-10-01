class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        int sum=0;
        for(int i=0;i<details.length;i++){
            sum+=(details[i].charAt(11)-'0');
            sum=sum*10+details[i].charAt(12)-'0';
            if(sum>60)
            c++;
            sum=0;
        }
        return c;
    }
}