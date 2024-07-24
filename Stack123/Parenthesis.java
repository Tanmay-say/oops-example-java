package Stack123;

import java.util.Stack;
public class Parenthesis {
    public static void main(String[] args) {
        String str = "((()))";
        System.out.println(isBalanced(str));
    }
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if((ch == ')' && stack.peek() == '(') || (ch == '}' && stack.peek() == '{') || (ch == ']' && stack.peek() == '['))
             {     
                if(stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
