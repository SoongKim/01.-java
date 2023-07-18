
public class MainAction {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.doAction();

		Base t2 = new Triangle();
		t2.doAction();
		// 위와 아래는 동일한 기능을 수행하는 코드이다.
		// 상속받은 개체는 이처럼 Base 명으로 통일할 수 있다.

		Square s1 = new Square();
		s1.doAction();

		Circle c1 = new Circle();
		c1.doAction();

		Base[] b = new Base[3];
		b[0] = new Triangle();
		b[0].doAction();
		b[1] = new Square();
		b[1].doAction();
		b[2] = new Circle();
		b[2].doAction();
		// 서로 다른 기능을 수행하는 클래스들이, 배열에 담겨 한 번에 관리하는게 가능해졌다.
		// 이건 더더더 많이 많이 신기하다.

	}
}