import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Selection_sort {
	public static void main(String[] args) throws Exception {
		// 백준 1427번 문제
		// Selection Sort를 사용한 양의 정수 구성 요소 내림 차순 출력 문네
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String N = st.nextToken();
		int lenN = N.length();
		int[] arr = new int[lenN];
		for (int i = 0; i < lenN; i++) {
			arr[i] = Integer.parseInt(N.split("")[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (i != j && arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.printf(arr[i] + "");
			} else {
				System.out.printf(arr[i] + "");
			}
		}
	}
}
