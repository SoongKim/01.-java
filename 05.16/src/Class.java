import java.util.ArrayList;

public class Class {
	// 학급 이름
	String name;
	// Student 클래스(학생 정보)를 담을 ArrayList를 선언
	ArrayList<Student> student = new ArrayList<Student>();
	// 학급 총점 변수
	int totalScore;
	// 학급 평균 점수 변수
	double avgScore;
	// 생성자 변수로 String name을 받아와 this.name에 설정
	Class(String name){
		this.name = name;
	}
	// 해당 클래스 내에 보유하고 있는 student 객체들의 priceInfo() 메소드를 실행하여 출력.
	public void printInfo(){
		for(int i = 0; i < student.size(); i++) {
			System.out.println(student.get(i).printInfo());
		}
	}
	// 총점을 초기화하고, for문을 통해 totalScore(총점, int type)을 산출, 이후 이를 return한다.
	public int printTotalScore() {
		this.totalScore = 0;
		for(int i = 0; i < student.size(); i++) {
			this.totalScore = this.totalScore + student.get(i).score;
		}
		return this.totalScore;
	}
	// 평균 및 인원수 초기화 후, for문 및 나누기를 통해 avgScore(평균, double type, 소수점 2자리까지 출력)를 this.avgScore에 저장.
	public void printAvgScore() {
		this.avgScore = 0;
		this.totalScore = 0;
		double count = 0;
		for(int i = 0; i < student.size(); i++) {
			this.totalScore = this.totalScore + student.get(i).score;
		}
		count = student.size();
		try {
			double avgScore = this.totalScore / (double)count;
			this.avgScore = (int)(avgScore*100) / (double) 100;
		}
		catch(Exception e) {
			System.out.println("Error Occured!");
		}
	}
}