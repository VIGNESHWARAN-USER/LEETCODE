
import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else{
                if(! stack.empty()){
                    switch(s.charAt(i)){
                        case ')':
                            if(stack.peek() == '(')
                                stack.pop();
                            else
                                return false;
                                break;
                        case '}':
                            if(stack.peek() == '{')
                                stack.pop();
                            else
                                return false;
                                break;
                        case ']':
                            if(stack.peek() == '[')
                                stack.pop();
                            else
                                return false;
                                break;
                        default:
                            return false;
                    }
                }else{
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
