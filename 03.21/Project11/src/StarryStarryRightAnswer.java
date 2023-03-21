
public class StarryStarryRightAnswer {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(j + 1);
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int y = 0; y < 2 * i + 1; y++) {
				System.out.print(i + 1);
			}
			System.out.println();
		}

		for (int i = 0; i < 7; i++) {
			for (int y = 0; y < i; y++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 7 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2*i+1; k++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		for(int e = 7; e > 0; e--) {
			for(int g = 0; g < 7-e; g++) {
				System.out.print(" ");
			}
			for(int w = 0; w > 2*e-1; w--) {
				System.out.print("*");
			}	
		}
		
//		for (int i = 0; i < 5; i++) {
//			for (int k = 4; k > i; k--) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//
//		for (int i = 2; i < 7; i++) {
//			for (int j = 1; j < i; j++) {
//				System.out.print(j);
//			}
//			System.out.println(" ");
//		}
//
//		for (int i = 1; i < 6; i++) {
//			for (int k = 5; k > i; k--) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 2 * i - 1; j++) {
//				System.out.print(i);
//			}
//			System.out.println(" ");
//		}
//		
//		for(int i = 0; i < 7; i++) {
//			for(int y = 7; y < i; y++) {
//				System.out.println(" ");
//			}
//			for(int j = 7; j >i; j--) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
	}
}