class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st =  new Stack<>();
        int ans = 0;

        for(int i =0;i<operations.length;i++){
            String s = operations[i];
            if(s.equals("+") || s.equals("C") || s.equals("D")){
                if(s.equals("+")){
                    int num1 = st.pop();
                    int num2 = st.pop();
                    st.push(num2);
                    st.push(num1);
                    st.push(num1+num2);
                }else if( s.equals("D")){
                     int num = st.peek();
                    st.push(num*2);
                }else{
                    st.pop();
                }
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        while(!st.isEmpty()){
            int num = st.pop();
            ans += num;
        }
        return ans;
    }
}