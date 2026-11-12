class Solution {
    public int[] findArray(int[] pref) {
        int n=0;
        for(int i=pref.length-1;i>0;i--){
            n=pref[i]^pref[i-1];
            pref[i]=n;

        }
        return pref;
    }
}