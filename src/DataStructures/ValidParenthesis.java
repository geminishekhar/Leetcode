package DataStructures;

class ValidParenthesis {
    public boolean isValid(String s) {
        int str_length=s.length();
        Stack<Character> par_stack=new Stack<>();
        if(str_length%2==0)
        {
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='[' ||s.charAt(i)=='{' || s.charAt(i)=='(')
                {
                    par_stack.push(s.charAt(i));
                }
                else if (s.charAt(i)==']' && !par_stack.isEmpty())
                {
                    if(par_stack.peek()=='[')
                        par_stack.pop();
                    else
                        return false;
                }
                else if (s.charAt(i)=='}' && !par_stack.isEmpty())
                {
                    if(par_stack.peek()=='{')
                        par_stack.pop();
                    else
                        return false;
                }
                else if (s.charAt(i)==')' && !par_stack.isEmpty())
                {
                    if(par_stack.peek()=='(')
                        par_stack.pop();
                    else
                        return false;
                }
                else
                    return false;
            }


        }
        else
            return false;
        if(par_stack.isEmpty())
            return true;
        else
            return false;


    }
}