
public class Review03_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		5! = 5*4*3*2*1;
//		n! = n * (n-1)*(n-2)*...*2*1

		System.out.println(factorial(5));
	}

	public static int factorial(int n) {
// 	���� n�� ������ �Ͽ� ���� ���� return�ϴ� �Լ� factorial�� ����
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
//		�� ��, factorial(1) = factorial(1 <= 1�� �ش�)
//		factorial(1) = 1�� return
//		�׷��Ƿ� 5 * 4 * 3 * 2 * 1 = 120�� ����ȴ�.