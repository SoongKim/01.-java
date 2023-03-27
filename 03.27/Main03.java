public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNum = 10;
		System.out.println(func(userNum));
		}
		
	public static int func(int n) {
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		else
			return func(n-2) + func(n-1);
	}
}