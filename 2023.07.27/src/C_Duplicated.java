import java.io.FileInputStream;
import java.util.Scanner;

public class C_Duplicated {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/inputDC.txt"));
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int M;
		for (int i = 0; i < N; i++) {
			M = sc.nextInt();
			for (int j = 0; j < M; j++) {
				System.out.printf(sc.nextInt() + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
