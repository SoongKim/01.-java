
public class Main_Lecture_01_C {

	String name;
	int count = 0;

	Main_Lecture_01_C() {
		this.name = "한국";
	}

	Main_Lecture_01_C(String name) {
		// 이름을 클래스와 동일하게 설정
		this.name = name;
	}
	// 생성자. 클래스를 실행할 때 자동으로 실행되는 것.
	// 현재 생성자 둘이 존재하고 있다.
	// 아무런 입력도 이뤄지지 않는다면 첫 번째 생성자가 실행되고,
//	 String 타입 입력이 이뤄진다면 두 번째 생성자가 실행된다.

	public void calcCount(Main_Lecture_01_B[] people) {
		for (int i = 0; i < people.length; i++) {
			if (people[i] == null) {
				continue;
			}
			// NULL Check
			if (people[i].address.equals(this.name)) {
				this.count++;
			}
		}
		System.out.println(this.name + " 인구 수 : " + this.count);
	}

}
