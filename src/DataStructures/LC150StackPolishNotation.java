package DataStructures;

public class LC150StackPolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> mystack=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            if (tokens[i].equals("+"))
            {
                int a = mystack.pop();
                int b= mystack.pop();
                int c=b+a;
                mystack.push(c);
            }
            else if (tokens[i].equals("-"))
            {
                int a = mystack.pop();
                int b= mystack.pop();
                int c=b-a;
                mystack.push(c);
            }
            else if (tokens[i].equals("*"))
            {
                int a = mystack.pop();
                int b= mystack.pop();
                int c=b*a;
                mystack.push(c);
            }
            else if (tokens[i].equals("/"))
            {
                int a = mystack.pop();
                int b= mystack.pop();
                int c=b/a;
                mystack.push(c);
            }
            else
            {
                int a=Integer.parseInt(tokens[i]);
                mystack.push(a);
            }
        }
        return mystack.pop();
    }
}