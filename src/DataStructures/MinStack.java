package DataStructures;

class MinStack {
    public Stack<Integer> orig_stack;
    public Stack<Integer> min_stack;

    public MinStack() {
        orig_stack=new Stack<>();
        min_stack=new Stack<>();

    }

    public void push(int val) {
        orig_stack.push(val);
        if(min_stack.isEmpty() || val<=min_stack.peek())
        {
            min_stack.push(val);
        }

    }

    public void pop() {
        if(!orig_stack.isEmpty())
        {
            if(orig_stack.peek().equals(min_stack.peek()))
            {
                min_stack.pop();
                orig_stack.pop();
            }
            else
                orig_stack.pop();
        }

    }

    public int top() {
        return orig_stack.peek();
    }

    public int getMin() {
        return min_stack.peek();
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