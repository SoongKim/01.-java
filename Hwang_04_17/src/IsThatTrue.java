
public class IsThatTrue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 18;
		int n = 0;
		
		while( x > 0) {
			n = n + (x % 10);
			x = x / 10;
		}
		
		System.out.println(n);
		
		
	}

}
