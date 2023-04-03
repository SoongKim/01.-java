
public class HW1_Review {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5! = 5*4*3*2*1
		// n! = n*(n-1)*(n-2)....
		System.out.println(facto(5));
		
		
		// 100~200
		// 100->
		// 200->
		System.out.println(mysum(100));
		
		// 1,1,2,3,5,8,13
		// f(1) = 1, f(2)=1, f(n) = f(n-1) + f(n-2)
	}
	
	public static int facto(int n) {
		if (n <= 1) return 1;
		
		return n * facto(n-1);
	}
	public static int mysum(int n) {
		if (n>=200) return 200;
		
		return n+mysum(++n);
	}
	
	public static int fibo(int n) {
		if( n<=2) return 1;
		
		return fibo(n-1) + fibo(n-2);
	}
	
}
