import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class I_sort_Bubble {

	public static void main(String[] args) throws Exception{
		// 정렬 알고리즘
		// 버블 / 선택 / 삽입 / 퀵 / 병합 / 기수
		
		// 01. Bubble Sort
		// 인접한 두 데이터의 크기를 비교하는 정렬 방법. 시간 복잡도 = N^2. 느리다.
		// 백준 2750번
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] Arr = new int[N];
		for(int i = 0; i < Arr.length; i++) {
			Arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i = 0; i < N-1; i++) {
			for(int j = 0; j < N-1-i; j++) {
				if(Arr[j] > Arr[j+1]) {
					int tmp = Arr[j];
					Arr[j] = Arr[j+1];
					Arr[j+1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(Arr));
	}

}
