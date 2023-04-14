import java.util.Scanner;

public class MainPage {
	ClassRoom[] cl = new ClassRoom[3];

	public static void main(String[] args) {
		MainPage mp = new MainPage();
		for (int i = 0; i < 3; i++) {
			mp.cl[i] = new ClassRoom();
		}
		for(int j = 0; j < 9999; j++) {
			System.out.println("학급을 선택해주세요.");
			System.out.println("A | B | C");
			Scanner scanner = new Scanner(System.in);
			String userSelC = scanner.next();
			if (userSelC.equals("A")) {
				mp.cl[0].main();
			} else if (userSelC.equals("B")) {
				mp.cl[1].main();
			} else if (userSelC.equals("C")) {
				mp.cl[2].main();
			} else {
				System.out.println("올바른 학급을 선택해주세요.");
			}
		}
	}
}