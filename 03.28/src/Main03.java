public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNum = 10;
//		paBo(5, 0);
		System.out.println(func(userNum));
	}

	public static int func(int a) {
		if(a == 0) {
			return 0;
		}
		else if(a == 1) {			
			return 1;
		}
		else
			return func(a-2) + func(a-1);
	}
}
	
//	public static void paBo(int a, int b) {
//		if( a == 1) {
//			System.out.println("합산결과는"+b);
//			return;
//		}
//		b = b + a;
//		a = a - 1;
//		paBo(a, b);
//
//	}
//}