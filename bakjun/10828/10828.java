import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class 10828 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> s = new Stack<>();

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            String c = br.readLine();

            switch(c.split(" ")[0]){
                case "push":
                    int v = Integer.parseInt(c.split(" ")[1]);
                    s.push(v);
                    break;
                case "pop":
                    if(s.isEmpty()){
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(s.pop()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(s.size()).append("\n");
                    break;
                case "empty":
                    sb.append(s.isEmpty() ? "1" : "0").append("\n");
                    break;
                case "top":
                    if(s.isEmpty()){
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(s.peek()).append("\n");
                    }
                    break;

            }
        }
        System.out.print(sb.toString());
    }
}
