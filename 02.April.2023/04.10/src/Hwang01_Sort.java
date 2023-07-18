import java.util.Arrays;
import java.util.Comparator;

public class Hwang01_Sort {

	public static void main(String[] args) {
		// ArraySort
		int[] arr = { 12, 43, 5, 4, 100, 88 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		// sort 알고리즘을 사용한 오름 차순 정렬

		// Arrays.sort(arr, Collections.reverseOrder());
		// int type은 reverseOrder() 적용 불가하다! 오류 두둥둥장
		Integer[] arr02 = new Integer[arr.length];
		// Integer 타입을 사용하기 위해 새로운 배열을 선언
		// Integer = int type + a + b + c ...
		// 아무튼 여러 기능을 더한 정수 타입의 데이터 타입
		for (int i = 0; i < arr02.length; i++) {
			arr02[i] = arr[i];
		}
		// arr02에 arr 데이터를 전송
//		Arrays.sort(arr02, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr02));
		
//		myCompareClass mcc = new myCompareClass();
//		Arrays.sort(arr02, mcc );
//		System.out.println(Arrays.toString(arr02));
//		
		Comparator<Integer> myCompare = new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return b -a;
			}
		};
		// 밑에서 호출하였던 함수와 동일하게 작성해준다.
		// 모양을 구축하는 방법을 익숙하게 체득해두자.
		
		
		Arrays.sort(arr02, myCompare);
		System.out.println(Arrays.toString(arr02));
		
		Arrays.sort(arr02, new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i1 - i2;
			}
		});
		
		Arrays.sort(arr02, (a, b)->{
			return b - a;
		});
		System.out.println(Arrays.toString(arr02));
	}// End of Hwang01_Sort

	// public이 아니다. 그냥 class를 선언했다.
	class myCompareClass implements Comparator<Integer> {
		// Comparator는 아무 것 없이 정의만 이뤄져 있다.
		// 구현은 호출한 쪽에서 이뤄지고, 그 전까지는 아무 것도 없다.
		// <> : Generic 이라는 문법. template과 같은 문법
		// <> <T>는 데이터 타입이 정의되지 않은 상태. 모든 것에 대응 가능
		// <Integer>를 입력하면 T가 Integer로 교체된다.
		public int compare(Integer a, Integer b) {
			return b - a;
		}
	}
}