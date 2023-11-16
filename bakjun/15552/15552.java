import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class 15552 {
	public static void main(String[] args) throws IOException {
 
		BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bwriter = new BufferedWriter(new OutputStreamWriter(System.out));
 
 
		int cnt = Integer.parseInt(breader.readLine());
        
		StringTokenizer stokenizer;
 
		for (int i = 0; i < cnt; i++) {
			stokenizer = new StringTokenizer(breader.readLine()," ");
			bwriter.write((Integer.parseInt(stokenizer.nextToken()) + Integer.parseInt(stokenizer.nextToken()))+ "\n");
		}
		breader.close();
        
		bwriter.flush();
		bwriter.close();
 
	}
}
