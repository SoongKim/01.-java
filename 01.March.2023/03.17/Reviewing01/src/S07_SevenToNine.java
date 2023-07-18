public class S07_SevenToNine {

	public static void main(String[] args) {

		int mainSeven = 7;
		int mainEight = 8;
		int mainNine = 9;

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("7 X " + i + " = " + mainSeven * i + ", Â¦¼öÀÔ´Ï´Ù.");
			} else {
				System.out.println("7 X " + i + " = " + mainSeven * i + ", È¦¼öÀÔ´Ï´Ù.");
			}
		}
		System.out.println("-----------------------------------");

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("8 X " + i + " = " + mainEight * i + ", Â¦¼öÀÔ´Ï´Ù.");
			} else {
				System.out.println("8 X " + i + " = " + mainEight * i + ", È¦¼öÀÔ´Ï´Ù.");
			}
		}

		System.out.println("---------------");

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("9 X " + i + " = " + mainNine * i + ", Â¦¼öÀÔ´Ï´Ù.");
			} else {
				System.out.println("9 X " + i + " = " + mainNine * i + ", È¦¼öÀÔ´Ï´Ù.");
			}
		}
	}
}