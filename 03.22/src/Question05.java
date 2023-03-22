
public class Question05 {

	public static void main(String[] args) {
		for(int i = 0; i < 9; i++) {
			for(int j = 8; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < ((2*i)+1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int x = 9; x > 0; x--) {
			for(int y = 9; y > x; y--) {
				System.out.print(" ");
			}
			for(int z = 0; z < (2*x-1); z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}