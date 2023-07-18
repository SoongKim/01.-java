import java.util.Arrays;

public class Test05_2 {

	public String main(int[]arr, int[]arr2) {
		String answer = "";
		// 입력 받은 배열을 변수에 삽입.
		int[] sol = arr;
		int[] sol2 = arr2;
		
		// sol 배열을 오름 차순 정렬하고,
		// 배열 값의 갯수를 세어 countArr 배열에 산입.
		int[] countArr = new int[arr.length];
		int count = 1;
		Arrays.sort(sol);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					count++;
				}
				countArr[i] = count;
				count = 1;
			}
		}
		
		// sol2 배열을 오름 차순 정렬하고,
		// 배열 값의 갯수를 세어 countArr2 배열에 산입
		Arrays.sort(sol2);
		int[] countArr2 = new int[arr2.length];
		int count2 = 1;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (i != j && arr2[i] == arr2[j]) {
					count++;
				}
				countArr2[i] = count2;
				count = 1;
			}
		}
		
		// 두 배열이 동일한 형상을 지니기 위해서는
		// 내부에 지닌 값과, 그 값의 갯수가 모두 일치하여야 한다.
		// 이에 각 배열을 정렬하고, 값들의 갯수를 센 배열 두 개가
		// 온전히 합치할 경우, 동일한 형상을 지닐 수 있음을 유추할 수 있다.
		
		// 이에 만약 두 배열의 길이가 다르다면 F를,
		// 하나라도 일치하지 않는 부분이 존재한다면 역시 F를,
		// 온전히 일치한다면 T를 결과값으로 출력하도록 로직을 작성하였다.
		for (int i = 0; i < arr.length; i++) {
			if (arr.length != arr2.length) {
				answer = "F";
				break;
			} else if (countArr[i] != countArr2[i]) {
				answer = "F";
				break;
			}
			else {
				answer = "T";
			}
		}
		return answer;
	}
}
