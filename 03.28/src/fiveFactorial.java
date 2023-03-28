public class fiveFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNum = 5;
		System.out.println(func(userNum));
	}

	public static int func(int n) {
		if(n <=1) {
			return n;
		}
		else
			return func(n-1)*n;
	}
}

// n 값이 1 이하에 해당하면 n을 return 받으므로 1을 return받습니다.
// 이외 입력한 5로부터 1씩 작아지는 재귀 함수를 호출하였으므로
// 5 * 4 * 3 * 2 * 1(==return)의 결과값인 120이 출력되는 것을 확인할 수 있습니다.