public class S07_SevenToNine {

	public static void main(String[] args) {

		int mainSeven = 7;
		int mainEight = 8;
		int mainNine = 9;

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("7 X " + i + " = " + mainSeven * i + ", ¦���Դϴ�.");
			} else {
				System.out.println("7 X " + i + " = " + mainSeven * i + ", Ȧ���Դϴ�.");
			}
		}
		System.out.println("-----------------------------------");

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("8 X " + i + " = " + mainEight * i + ", ¦���Դϴ�.");
			} else {
				System.out.println("8 X " + i + " = " + mainEight * i + ", Ȧ���Դϴ�.");
			}
		}

		System.out.println("---------------");

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("9 X " + i + " = " + mainNine * i + ", ¦���Դϴ�.");
			} else {
				System.out.println("9 X " + i + " = " + mainNine * i + ", Ȧ���Դϴ�.");
			}
		}
	}
}