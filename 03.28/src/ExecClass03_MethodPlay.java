import java.util.Scanner;

public class ExecClass03_MethodPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort sort = new Sort();
		// Sort 라는 클래스를 호출
		sort.doSort();
		//doSort 를 통해 Sort의 메소드를 실행
		Sort02 sort2 = new Sort02();
		sort2.abc();
		
		Scanner scanner = new Scanner(System.in);
		// Scanner 클래스를 불러올 때
		// ()는 객체에게 주는 값이다.
		// System.in : 스캐너의 대상. 시스템의 키보드 입력장치를 의미
		// 반대로 데이터 범주의 제약을 줄 수도 있다. 비워도 발생 가능.
	
	}

}
