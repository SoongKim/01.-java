
public class Main_Lecture_08 {

	String name;
	int kor;
	int eng;
	int math;
	
	// getter�� setter. ���� �������� �κа� ����ϴ� �κ��� ������ ����ϴ� ���.
	// ����� �������� �� �̻� ������� �ʴ� ��Ģ�̴�.
	// set + value : ���� �ҷ����� ����
	// get + value : ���� ���� ����
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