
public class Review05_fivoNazzi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(nazzi(10));
//		System.out.println(fibo(10));
	}

	public static int nazzi(int n) {
		if (n == 0)
			return 0;
		if (n == 1) {
			return 1;
		} else
			return nazzi(n - 2) + nazzi(n - 1);
	}

//	Ȥ��
//	public static int fibo(int n) {
//		if (n <= 2)
//			return 1;
//		else
//			return fibo(n - 2) + fibo(n - 1);
//	}
//	������ ������ �Ǻ� ���ñ� ģ��
}