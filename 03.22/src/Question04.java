
public class Question04 {

	public static void main(String[] args) {
		for(int i = 0; i < 9; i++) {
			for(int j = 9; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
