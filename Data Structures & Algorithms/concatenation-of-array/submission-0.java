class Solution {
    public int[] getConcatenation(int[] arr) {
        ArrayList<Integer>list= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }

        int[] ans= new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}