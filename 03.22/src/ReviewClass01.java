import java.util.Scanner;

public class ReviewClass01 {

	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		System.out.println(a == "abc");
		// true
		System.out.println(a == b);
		// true

		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();

		System.out.println(a == inputString);
		// false. why???
		// value versus value 비교가 아닙니다.
		// 객체 대 객체 비교를 해야만 합니다.
		// 이 때 .equals를 사용합니다.
		System.out.println(a.equals(inputString));
		// 요러면 트루가 나옵니당. 잘했어. 잘했어.

		int c = 3; // 어딘가의 메모리에 c는 3이라고 저장
		int d = 4; // 어딘가의 메모리에 d는 4라고 저장
		int temp; // 어딘가의 빈 메모리(공간)에 temp 라는 임시 변수를 저장
		//함수의 등장. 역습의 함수.
		
		int e[] = {1, 2, 3, 4, 5};
		// g라는 대표 화살표. g를 대가리로 여러 데이터를 저장하였다.
		// g는 데이터가 아닌 레퍼런스.
		// 서로 다른 데이터에 접속할 수 있도록 길을 빌려주는 존재.
		// 그 자체만으로는 의미가 없다. 연결고리일 뿐
		// 객체 개념을 인식할 때 가장 중요한 건 레퍼런스!
		
	}

}
