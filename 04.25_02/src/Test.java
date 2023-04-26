public class Test {

	public void doAction() {
		System.out.println("Hello world");
	}
	
	public void doAction(int number) {
		System.out.println("Nice to meet you");
	}
	// 동일한 이름을 지닌 여러 메소드를 생성하고,
	// 해당 메소드가 사용하는 파라미터(변수)를 통해 구분할 수 있다.
	// 다만, 정수와 실수 파라미터를 받아 오는 경우
	// 어떤 데이터 타입인지 애매해지는 경우가 발생하니
	// 사용을 지양하자.
	
	public void doAction(int number, int number2) {
		System.out.println("Good day, sir");
	}
	public void doAction(String input) {
		System.out.println("Have a nice day, sir");
	}
	
	@Override
	public String toString() {
		System.out.println("sdfsdfsdfsdf");
		return "Asdfsdf";
	}
}
