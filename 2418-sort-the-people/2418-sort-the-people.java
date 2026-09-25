class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int[] du=heights.clone();
        int c=-1;
        String[] nam=new String[names.length];
        Arrays.sort(du);
        for(int i=names.length-1;i>=0;i--){
            for(int j=0;j<names.length;j++){
                if(du[i]==heights[j])
                nam[names.length-1-i]=names[j];
            }
        }
        return nam;
    }
}