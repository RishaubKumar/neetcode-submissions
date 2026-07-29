class Solution {
    public void reverseString(char[] s) {
        int i =0 , j = s.length-1;
        while(i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        for(int k = 0;k<s.length;k++){
            System.out.print(s[k]);
        }
    }
}