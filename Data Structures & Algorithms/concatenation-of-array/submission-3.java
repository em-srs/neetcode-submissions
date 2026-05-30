class Solution {
    public int[] getConcatenation(int[] arr) {
        int n=arr.length;
        // int[] result= new int[2*n];
        // for(int i=0;i<n;i++){
        //     result[i]=arr[i];
        //     result[i+n]=arr[i];
        // }
        // return result;
        ArrayList<Integer> res= new ArrayList<>(); // 2 baar add kro, then convert kr do array me
        for(int x:arr){
            res.add(x);
        }
        for(int y:arr){
            res.add(y);
        }
        //return type of the function in a primitive int array, but we added elements in ArrayList
        //so we need to convert ArrayList to array first then return that array
        int[] ans= new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}