import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class I_SlidingWindow {

	public static void main(String[] args) throws Exception{
		// 백준 12891. DNA 비밀번호
		// DNA문자열 : {'A', 'C', 'G', 'T'}
		// A는 1개, C는 1개, G는 1개, T는 0개 이상 등장할 것. 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String s = br.readLine();
		int[] arr = new int[4];
		int lenArr = arr.length;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < lenArr; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(Arrays.toString(arr));
		//CONTINUE;
	}

}
