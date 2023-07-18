import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Afirst {

	static int T;//반복수
	static int N;//토끼의 마릿수
	
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("src/inputRabbit.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		StringTokenizer tokens = new StringTokenizer(br.readLine());
		int[]E = new int[tokens.countTokens()];
		for(int i = 0; tokens.hasMoreElements(); i++) {
			E[i] = Integer.parseInt(tokens.nextToken());
		}
		for(int test_case = 0; test_case < T; test_case++) {
			
		}
	
	}
}
