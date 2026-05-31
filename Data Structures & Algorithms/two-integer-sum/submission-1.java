class Solution {
    class Pair implements Comparable<Pair>{
        int first; int second;
        Pair(int first, int second){
            this.first=first;
            this.second=second;
        }
        public int compareTo(Pair P){
            return this.first-P.first;
        }
    }
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        Pair[] pear=new Pair[n]; // we created a pair array here
        for(int i=0;i<n;i++){ //putting all the pair,og index of the array
            pear[i]=new Pair(arr[i],i);
        }
        Arrays.sort(pear); //sort  the pair array--> we used Array.sort() cause we had a pair ARRAY
        // not any ArrayList of pair
        

        //now we apply two pointer approach on the first of pair values
        int i=0;
        int j=n-1;
        while(i<j){
            int sum= pear[i].first+pear[j].first;
            if(sum==target){
                int a=pear[i].second;
                int b=pear[j].second;
                //return the smaller index first so-->
                if(a>b){
                    return new int[]{b,a};
                }else return new int[]{a,b};
            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{};
    }
}
