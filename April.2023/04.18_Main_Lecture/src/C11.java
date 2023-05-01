
public class C11 {
	static String name = "pd";
	
	public static void main(String[] args) {
	// private이 걸린 변수와 메소드는 해당하는 클래스에서만 사용 가능하다.
	// 외부 클래스에서는 해당 변수 및 메소드를 호출할 수 없게 제한한다.
	// 이러한 것을 '접근 제한자'라고 한다.
	// 만들 때는 public으로 하고, 이후 상황에 맞게 변경하자.
	// 타입 종류로는
	// public, private, protected, default가 존재한다.
	
	// public type은 어디서든 불러올 수 있다.
	// protected type은 내부 + 상속 받은 클래스에서만 사용 가능하다.
	// 아무 것도 적혀있지 않으면(=default type), 같은 패키지 내에서만 사용 가능하다.
	}

}
