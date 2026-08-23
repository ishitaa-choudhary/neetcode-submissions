class MinStack {

    private Stack<Integer> st;
    private Stack<Integer> rt;
    public MinStack() {
        st=new Stack<>();
        rt=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(rt.isEmpty() || val<rt.peek()) rt.push(val);
        else rt.push(rt.peek());
        
    }
    
    public void pop() {
        st.pop();
        rt.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        
        return rt.peek();
    }
}
