import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (true) {
            input = br.readLine();

            if (input.equals(".")) {
                break;
            }

            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true; 

            for (int i = 0; i < input.length(); i++) {
                char current = input.charAt(i);

                if (current == '(' || current == '[') {
                    stack.push(current);
                }

                else if (current == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop(); 
                }

                else if (current == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isBalanced = false;
                        break;
                    }
                    stack.pop(); 
                }
            }
          
            if (!stack.isEmpty()) {
                isBalanced = false;
            }
          
            System.out.println(isBalanced ? "yes" : "no");
        }
    }
}
