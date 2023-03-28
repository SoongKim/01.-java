
public class ExecClass05_SaveBox02 {

	public static void main(String[] args) {
		ExecClass05_SaveBox s1 = new ExecClass05_SaveBox();
		ExecClass05_SaveBox s2 = new ExecClass05_SaveBox();
		ExecClass05_SaveBox s3 = new ExecClass05_SaveBox();
		
		
		s1.setName("악어");
		s2.setName("토끼");
		// new 를 사용해 새로 클래스를 호출하면
		// 메모리 한 켠에 이를 저장한다.
		// 위의 s1, s2 등은 저장된 것을 호출하기 위한 이름일 뿐
		
		s1.deposit();
		s1.deposit();
		
		// 괄호로 감싸면 Method
		// 괄호 없이 값으로 딸랑 있으면 property
		
		s2.deposit();
		
		s1.withdraw();
		s2.withdraw();
		s3.withdraw();
		// s2.coin = 300;
		// coin 값을 인위로 수정해버렸다. 바람직하지 못한 방법
		// 그러나 현대 프로그래밍에서는 상황에 따라 이를 사용하기도 함
		// 제어만 확실히 할 수 있다면 오히려 더욱 명확한 방법
		// 그러나, JAVA에서는 객체만 다루는 것이 원론(Default)!
		
		
	// 동일한 메소드를 불러와도, 여러 객체를 서로 다른 이름으로 불러오면
	// 각 이름에 해당하는 메소드만 동작한다.
	// 서로 다른 값(property)이 변동한다.
	// 같은 데서 불러 왔다고 다 일괄하여 행동하는 것이 아니다!
	// 결국 프로그래밍은 원청과 하청, 하청의 재하청으로 동작한다.
	}
}