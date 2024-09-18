import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.io.IOException;

public class 10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> s = new Stack<>();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                s.pop();
            } else {
                s.push(x);
            }
        }

        int a = 0;
        while (!s.isEmpty()) {
            a += s.pop();
        }
        System.out.print(a);
    }
}
