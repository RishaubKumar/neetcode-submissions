class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0, j  = 0, maxLen = 0 , maxfreq = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        while(j<s.length()){
            char ch = s.charAt(j);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            maxfreq = Math.max(hm.get(ch),maxfreq);

            while((j-i+1)-maxfreq > k){
                char c = s.charAt(i);
                hm.put(c,hm.get(c)-1);
                i++;
            }
            maxLen = Math.max(maxLen,j-i+1);

            j++;
        }
        return maxLen;
    }
}
