
public class Question06 {

	public static void main(String[] args) {
		for(int i = 8; i > 0; i--) {
			for(int k = 8; k > i; k--) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int x = 1; x < 8; x++) {
			for(int y = 8; y-1>x; y--) {
				System.out.print(" ");
			}
			for(int z = 0; z < 2*x+1; z++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}