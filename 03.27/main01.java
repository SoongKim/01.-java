public class Main01 {

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