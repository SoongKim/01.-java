
public class Review03_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		5! = 5*4*3*2*1;
//		n! = n * (n-1)*(n-2)*...*2*1

		System.out.println(factorial(5));
	}

	public static int factorial(int n) {
// 	정수 n을 변수로 하여 정수 값을 return하는 함수 factorial을 생성
		if (n <= 1)
			return 1;

		return n * factorial(n - 1);
	}
}		
//		if n =5
//		5 * factorial(4)
//	=	5 * 4 * factorial(3)
//	=	5 * 4 * 3 * factorial(2)
//	=	5 * 4 * 3 * 2 * factorial(1)
//		이 때, factorial(1) = factorial(1 <= 1에 해당)
//		factorial(1) = 1을 return
//		그러므로 5 * 4 * 3 * 2 * 1 = 120이 도출된다.