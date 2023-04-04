
public class Main_Lecture_02_Main_SaveBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main_Lecture_02_SaveBox[]saveBox = new Main_Lecture_02_SaveBox[100];
		// 해당 변수 선언을 통해 우리는
		// (1) saveBox라는 객체 변수는 Main_Lecture_02_SaveBox라는 객체를 담는 변수이다.
		// (2) saveBox는 총 0~99까지 100개의 칸을 지닌 배열이다.

		saveBox[0] = new Main_Lecture_02_SaveBox();
		// saveBox의 0번 인덱스 자리에 새로운 Main_Lecture_02_SaveBox 객체를 호출하였다.
		saveBox[0].toString();
		// saveBox[0]에 toString 기능(메소드)을 호출하였다.
	}
}