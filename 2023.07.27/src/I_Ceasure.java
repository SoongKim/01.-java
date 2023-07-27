import java.io.BufferedReader;
import java.io.InputStreamReader;

public class I_Ceasure {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String target = br.readLine();
		String answer = "";
		Character[] arr = new Character[target.length()];
		int lenArr = arr.length;
		for (int i = 0; i < lenArr; i++) {
			arr[i] = target.charAt(i);
		}
		int n = 3;
		for(int i = 0; i < lenArr; i++) {
			if(arr[i] == ' ') {
				answer += arr[i].toString();
				continue;
			}
			int ascArr =(int) arr[i];
			if(ascArr + n > (int)'z') {
				ascArr = ascArr - (int)'z' + 3;
				arr[i] = (char)ascArr;
			}
			else if(ascArr + n> (int)'Z') {
				ascArr = (int)'a' + n;
				arr[i] = (char)ascArr;
			}
			answer += arr[i].toString();
		}
		System.out.println(answer);
		System.out.println((int)'z');
		System.out.println((int)'Z');
	}
}

class solle{
	public String solution(String s, int n) {
		String answer = "";
		Character[] arr = new Character[s.length()];
		int lenArr = arr.length;
		for(int i = 0; i < lenArr; i++) {
			arr[i] = s.charAt(i);
			if(arr[i] == ' ') {
				answer += arr[i].toString();
				continue;
			}
			int ascArr = (int)arr[i];
			arr[i] = (char)(ascArr + n);
			answer += arr[i].toString();
		}
		return answer;
	}
}