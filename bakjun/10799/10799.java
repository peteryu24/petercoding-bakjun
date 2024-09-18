import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class 10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();  // 입력 받기
        Stack<Character> stack = new Stack<>();  // 스택을 사용하여 쇠막대기 상태 관리
        int pieces = 0;  // 최종 조각의 개수를 저장할 변수

        for (int i = 0; i < input.length(); i++) {
            // 여는 괄호 '('일 경우, 스택에 추가 (쇠막대기 시작)
            if (input.charAt(i) == '(') {
                stack.push('(');
            } else {  // 닫는 괄호 ')'일 경우
                stack.pop();  // 쇠막대기 끝 또는 레이저 처리 후 pop
                
                // 레이저일 경우 (직전 문자가 '('일 때)
                if (input.charAt(i - 1) == '(') {
                    // 현재 스택에 쌓인 쇠막대기 개수만큼 조각이 추가됨
                    pieces += stack.size();
                } else {
                    // 쇠막대기의 끝이므로, 1개의 조각 추가
                    pieces += 1;
                }
            }
        }

        System.out.println(pieces);  // 결과 출력
    }
}
