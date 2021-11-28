class MinStack 
{
    Stack <Long> st = new Stack<>();
    Long min;
    public MinStack() 
    {
        min =Long.MAX_VALUE;
    }
    public void push(int val) 
    {
        Long ele = Long.valueOf(val);
        if(st.isEmpty())
        {
            st.push(ele);
            min=ele;
        }
        else if (ele<min)
        {
            st.push(2*ele-min);
            min = ele;
        }
        else
            st.push(ele);
    }
    public void pop() 
    {
        Long ele =st.pop();
        if(ele<min)
            min=2*min-ele;
    }
    public int top() 
    {
        Long ele =st.peek();
        if(ele<min)
            return min.intValue();
        return ele.intValue();
    }
    public int getMin() 
    {
        return min.intValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */