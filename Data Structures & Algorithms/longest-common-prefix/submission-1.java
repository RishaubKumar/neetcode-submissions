class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        StringBuilder sb = new StringBuilder("");
    
        for (int i = 0; i < Math.min(strs[0].length(), strs[1].length()); i++) {
            if (strs[0].charAt(i) != strs[1].charAt(i)) {
                break;
            } else {
                sb.append(strs[0].charAt(i));
            }
        }
        for(int i = 1;i<strs.length;i++){
            if (sb.length() > strs[i].length()) {
                sb.setLength(strs[i].length());
            }
            for(int j = 0;j<sb.length();j++){
                if( sb.length() <= strs[i].length()){
                    if(sb.charAt(j) == strs[i].charAt(j)){
                        continue;
                    }else{
                        sb.deleteCharAt(j);
                        j--;
                    }
                
                }
            }
        }
        return sb.toString();
    }
}