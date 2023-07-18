
public class Main_Lecture_02 {
	static final int MAX = 100;
	// static 변수 설정 간에는 모두 대문자를 사용한다.
	// 보통 Java는 camel style을 지향하고, _ 사용을 지양하나
	// 유일하게 static final 변수명 연결 간에는 _를 사용한다. 이는 약속이다.
	// final 없는 static은 똑같이 소문자로 작성한다.
	
	// static 변수의 장점!
	// 1. 객체를 만들지 않고 사용 가능하다.
	// 2. 새로 객체를 만들어도 초기화 X
	
	// 클래스마다 공유하여야 하는 값이 존재한다면, 이를 static 변수로 잡아서
	// 보존할 수 있다.
	public static void likeFunction() {
		System.out.println("HELLO");
	}
}
