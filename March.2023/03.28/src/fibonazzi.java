public class fibonazzi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNum = 10;
		System.out.println(func(userNum));
	}

	public static int func(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else
			return func(n - 2) + func(n - 1);
	// 피보나치 수열은 자신의 앞 두 수를 더한 값을 자신의 값으로 하는 수열입니다.
	// 이에 자신의 앞에 두 개의 데이터가 존재하지 않는 0과 1의 경우 그대로 자신을 출력하고,
	// 그렇지 않은 경우 n-2와 n-1에 해당하는 피보나치 수열 함수를 불러옴으로써
	// n 번째에 위치한 값을 출력할 수 있습니다.
	// 해당 코드를 통해 10 번째 값으로 55가 출력됨을 확인할 수 있습니다.
	}
}