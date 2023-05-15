import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class CodingTest {

	public static void main(String[] args) {

		System.out.println(Integer.parseInt("FF", 16));
		// 16진수를 10진수로 표시하는 메소드.
		// 16진수는 0~9 + A ~ F 로 이뤄진 수 체계이다.

		System.out.println(Integer.parseInt("110", 2));
		// parseInt(대상 수, 적용할 진수)
		// ("110", "2") 라면 2진수 110을 10진수로 출력한다.
		// 0 * 1 + 1 * 2 + 4 * 2 인 6이 출력된다.

		System.out.println(Integer.toBinaryString(6));
		// 10진수 표기 정수 i를 2진수로 표시하는 메소드.

		System.out.println(Integer.toHexString(255));
		String alpha = Integer.toHexString(16);
		// toHexString은 대상 정수 i를 16진수로 표시한다.
		// 문자열 자료 형태로 출력된다.

		// ==

		System.out.println(Integer.toString(255, 16));
		// toString으로, 255를 16진수로 출력하면 위와 동일한 결과가 도출된다.

		System.out.println(Integer.toOctalString(16));
		// ==
		System.out.println(Integer.toString(16, 8));
		// toOctalString은 대상 정수 i를 8진수로 표시한다.

		StringBuilder builder = new StringBuilder();
		// Scanner보다 효율적으로 메모리를 사용하는 StringBuilder.
		// 역순 정렬도 간편하게 이뤄진다.
		builder.append("abcdefghi");
		System.out.println(builder);

		StringBuilder builder02 = new StringBuilder();
		builder02.append("12345");
		builder02.reverse();
		System.out.println(builder02);
		// 그저 append 한 후, reverse 구문을 걸어준 것만으로도
		// 멋진 문자열 역순 출력이 가능하다.

		int[] array = new int[] { 10, 20, 1, 7, 1 };

		Arrays.sort(array);

		System.out.println(Arrays.toString(array));
		// array 배열 선언과 오름차순 정렬(Arrays.sort) 기능

		for (int number : array)
			System.out.print(number + ", ");
		// 배열 단위가 아닌, 배열 내 값만 출력해야 할 때는
		// each:array 구문을 사용할 수 있다.
		// 꼭 변수명이 each일 필요는 없고, : 만 사용해주면 된다.

		System.out.println();

		// List, ArrayList, 그리고 Vector

		Vector<Integer> list = new Vector<Integer>();
		list.add(10);
		list.add(20);
		list.add(1);
		list.add(7);
		list.add(1);
		System.out.println(list);
		// 이것만 봐서는 ArrayList와 무슨 차이가 존재하는지 모르겠다.

		System.out.println(list.contains(10));
		System.out.println(list.contains(30));
		// Vector 내에 대상 값이 존재하면 true가, 없으면 false가 출력된다.

		Collections.sort(list);
		System.out.println(list);
		// Arrays.sort가 아닌, Collections.sort로 오름 차순 정렬이 가능하다.
		System.out.println(list.get(0));
		// list[i] 형태가 아닌, list.get(i) 형태로 배열 내 값을 불러온다.

	}
}
