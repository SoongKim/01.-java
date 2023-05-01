import java.util.Random;

public class Main_Lecture_01_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Random ran;
		ran = new Random();
		
		
		
		
		// 1. 객체 생성
		// TestClass t = new TestClass();
		// 메모리 어딘가에 t 라고 불리는 변수 공간에 TestClass라는 객체(클래스)를 집어넣는다.
		// 그렇기에 t를 호출함으로써 TestClass()의 메소드를 호출할 수 있게 되었다.
		// 마찬가지로 int a = 10; 이라고 할 때
		// 우리는 메모리 상의 a 라는 변수에 10이라는 값을 저장하였다. 같은 개념이다.
		
		// 2. 변수의 선언
		// Java는 메모리 공간을 만들 때( = 변수를 만들 때) 해당 변수에 담을 데이터 타입을 지정해줘야 한다.
		// TestClass t의 의미는, t에 담을 데이터가 TestClass라는 객체임을 말한다.
		// int a = 10;과 비교해보자.
		// 이는 a 라는 변수에 int(정수) 값만을 담겠다는 선언을 의미한다.
		// 객체를 대상으로 하는 변수도 이와 같은 맥락을 지닌다. 이러한 변수는 '객체 변수'라고 한다.
		// 객체 변수에 객체(Class)를 담았다고 이해하면 된다.
		// 객체 변수로부터 객체를 호출하면 해당 객체가 지닌 메소드들을 활용할 수 있다.
		//
		// 이러한 '객체 변수'를 사용하면, 동일한 객체를 서로 다른 '객체 변수'에 연결하여 병렬 사용할 수 있다.
		
		// 3. 객체 변수의 선언
		// (1) Random random = new Random();
		// (2) Random random --- 1.
		//	   random = new Random(); --- 2.
		// (1)번 방식과 (2)번 방식은 동일한 기능을 수행한다. 다만,
		// 다만, (2) - 1의 경우, (2)-2가 이어지지 않으면 변수는 지정하였으나 대상이 되는 객체가 존재하지 않기에
		// Null Point Exception 오류가 발생한다.
		// 이는 호출할 객체가 존재하지 않는데, 단순히 연결만 해놨으니 할 수 있는 일이 없다는 오류가 출력된다.
		
		
		
	}
}