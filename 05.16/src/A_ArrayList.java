import java.util.ArrayList;

public class A_ArrayList {

	public static void main(String[] args) {
		// ArrayList 학습

		ArrayList<Object> e = new ArrayList<Object>();
		// 크기가 고정되지 않은 배열이 필요하면 ArrayList

		e.add(new String("1"));
		// e[0] 식은 사용 불가. ArrayList는 기본 자료형이 아니므로.
		// 따라서 위와 같은 기능을 사용하기 위해서는 e.get(0) 형식이 필요하다.

		// 크기 역시 e.length가 아닌 e.size()가 필요하다.

		String[] f = new String[10];
		// 크기가 Fixed된 배열이 필요하면 Array

		String[] g = { "1", "2", "3" };
		// Array는 요렇게도 선언이 가능하다.

		Object a = new String("cc");
		String b = new String("dd");
		// Object형 변수와 String형 변수. 구분이 다릅니다.

		((String) a).getBytes();
		// 변수에 따라 사용할 수 있는 메소드가 달라진다.
		// 형변환이 이뤄지면 사용할 수 있는 메소드 역시 달라진다.

		// Generic Type이 선언되면, 컴퓨터는 이에 맞춰 사용 가능 메소드를 호출.

		B_Student[] arr = { new B_Student("홍길동", 80), new B_Student("둘리", 30) };

		B_Student[] arr2 = new B_Student[2];
		arr2[0] = new B_Student("홍길동", 80);
		arr2[1] = new B_Student("둘리", 20);
		// B_Student를 Array에 불러 오는 방법.
		// 첫 번째 방식은 배열 초기화를 시행하였고,
		// 두 번째 방식은 메모리 내 공간 선언 후, 하나씩 값을 입력.

		ArrayList<B_Student> arr3 = new ArrayList<B_Student>();
		// ArrayList에 B_Student를 불러 오는 방법.

		arr3.add(new B_Student("홍길동", 100));
		arr3.add(new B_Student("둘리", 20));
		arr3.add(new B_Student("또치", 50));
		// ArrayList는 크기 고정 및 제한이 존재하지 않으므로
		// 입력 시마다 새로운 공간을 할당하여 값을 입력받는다.
		// 입력 순서대로 인덱스 번호가 부여된다.
		// 객체 데이터를 담은 ArrayList는 해당 객체가 지닌 모든 메소드에 접근 가능.

	}

}
