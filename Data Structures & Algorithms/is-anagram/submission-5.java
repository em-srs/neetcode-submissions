class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] freqS= new int[26]; //hass array for both the strings
        int[] freqT= new int[26];

        for (int i = 0; i < s.length(); i++) {
            freqS[s.charAt(i) - 'a']++; // Added ++
            freqT[t.charAt(i) - 'a']++; // Changed () to [] and s to t
        }
        for(int i=0;i<26;i++){
            if(freqS[i]!=freqT[i]){
                return false;
            }
        }
        return true;
    }
}
