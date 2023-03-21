public class primeNum01 {

	public static void main(String[] args) {

		for (int number = 2; number < 101; number++) {

			boolean primeNum = true;
			for (int i = 2; i < number; i++) {
				if (i < 2) {
					continue;
				}
				if (number % i == 0) {
					primeNum = false;
					break;
				}
			}
			if (primeNum) {
				System.out.println(number);
			}
		}

		
		
//		for(int i = 0; i < 101; i++) {
//			if(i < 2) {
//				continue;
//			}
//			for(int j = 2; j < i; j++) {
//				if(i % j != 0) {
//				primeNum = false;
//				}
//			}
//			if(primeNum == true) {
//				System.out.println(i);
//			}
//		}
	}
}