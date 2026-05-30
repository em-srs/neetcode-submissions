class Solution {
    public int[] getConcatenation(int[] arr) {
        int n=arr.length;
        int[] result= new int[2*n];
        for(int i=0;i<n;i++){
            result[i]=arr[i];
            result[i+n]=arr[i];
        }
        return result;
    }
}