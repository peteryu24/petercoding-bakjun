import java.util.Stack;

class Solution {
    boolean solution(String s) {
        if(s.startsWith(")")) return false;
        if(s.endsWith("(")) return false;
        
        Stack<Character> stack = new Stack<>();
        
         for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}