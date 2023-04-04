
public class Main_Lecture_08 {

	String name;
	int kor;
	int eng;
	int math;
	
	// getter와 setter. 값을 가져오는 부분과 출력하는 부분을 나눠서 사용하는 방법.
	// 기술의 발전으로 더 이상 종용되지 않는 규칙이다.
	// set + value : 값을 불러오는 변수
	// get + value : 값을 뱉어내는 변수
	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int setKor() {
		return this.kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int setEng() {
		return this.eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int setMath() {
		return this.math;
	}

}