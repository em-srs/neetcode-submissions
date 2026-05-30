class Solution {
    public boolean hasDuplicate(int[] arr) {
        HashSet<Integer> saw= new HashSet<>();
        for(int x: arr){
            if(saw.contains(x)){
                return true;
            }
            saw.add(x);
        }
        return false;
    }
}