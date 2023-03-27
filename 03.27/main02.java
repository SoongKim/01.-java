public class Main02 {

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