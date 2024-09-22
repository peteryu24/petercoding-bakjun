import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 11899 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                s.push('(');  
            } else { // 닫는 괄호일 경우
                if (!s.isEmpty() && s.peek() == '(') {
                    s.pop();  
                } else {
                    s.push(')');  
                }
            }
        }
        System.out.println(s.size());
    }
}
