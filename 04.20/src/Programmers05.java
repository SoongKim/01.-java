public class Programmers05 {

	public static void main(String[] args) {
		int answer = 0;
		int n = 12;
		for(int i = 1; i<n; i++) {
			if(n % i == 1) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
	}
}
