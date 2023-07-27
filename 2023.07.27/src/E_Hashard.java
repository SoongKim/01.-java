import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E_Hashard {
public static void main(String[] args) throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String N = br.readLine();
	boolean answer = true;
	int target = 0;
	for(int i = 0; i < N.length(); i++) {
		target += Integer.parseInt(N.split("")[i]);
	}
	if(Integer.parseInt(N) % target != 0) {
		answer = false;
	}
	System.out.println(answer);
}
}

class Solution{
	public boolean solution(int x) throws Exception{
		boolean answer = true;
		String N = Integer.toString(x);
		int target = 0;
		for(int i = 0; i < N.length(); i++) {
			target += Integer.parseInt(N.split("")[i]);
		}
		if(Integer.parseInt(N) % target != 0) {
			answer=  false;
		}
		return answer;
	}
}
