class Solution {
    public int evalRPN(String[] nums) {
       
       Stack<Integer> st=new Stack<>();
        for(String ch: nums){
            if(ch.equals("+"))
                st.push(st.pop() + st.pop());
            
            else if(ch.equals("-")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b - a);
            }

            else if(ch.equals("*")) 
            st.push(st.pop() * st.pop());

            else if(ch.equals("/")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b / a);
            }
            
            else st.push(Integer.parseInt(ch));
        }
        return st.peek();
    }
}
