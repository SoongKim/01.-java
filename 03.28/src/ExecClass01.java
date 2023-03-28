import java.util.Arrays;

public class ExecClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열에 관하여 살펴보자.
		int []numbers = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		// 뒤에 인덱스가 붙지 않은 numbers는 변수가 아니다.
		// 반면 인덱스가 붙은 numbers[0]은 변수이다.
		// 즉, numbers 자체는 주소를 가르키는 대표자일 뿐, 변수가 아님.

		System.out.println(numbers);
		// 배열을 이따위로 해서 출력하면 배열의 메모리 내 주소가 출력된다.
		// 해당 출력의 경우 [I@5d22bbb7 가 출력된다.
		// 정확히는 배열이 출발하는 지점의 메모리 내 주소값.
		
		int[]mm;
		mm = numbers;
		// mm = 배열 numbers이므로 mm 또한 동일한 주소를 가르킨다.
		
		System.out.println(Arrays.toString(mm));
		System.out.println(Arrays.toString(numbers));
		// 위의 두 출력 문구는 동일한 배열을 출력한다.
		// mm은 numbers랑 똑같은 애니까.
		
		// 이상 배열이었습니다.
		// 모든 프로그램 언어에서 사용하는 친구랍니다.
		// 지칭하는 단어는 달라도, 모두 같은 개념을 다룹니다.
	}

}
