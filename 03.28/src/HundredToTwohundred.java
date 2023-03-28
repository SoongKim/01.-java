public class HundredToTwohundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userNum = 100;
		System.out.println(func(userNum));
	}

	public static int func(int a) {
		if(a > 199)
			return a;
		else
			return a + func(a+1);
	}
}
// a 값이 199를 초과하는 순간 누적된 합산값에 대상값 a를 return받아 더해줍니다.
// 이를 통해 100부터 200까지 더한 값 15,150이 출력됨을 확인할 수 있었습니다.