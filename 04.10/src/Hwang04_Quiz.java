import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Hwang04_Quiz {

	public static void main(String[] args) {
		File file = new File("inputAS.txt");

		try (Scanner sc = new Scanner(file, StandardCharsets.UTF_8)) {
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// ���� �ҷ�����
		int[][] arr02 = new int[3][1];
		// ���� ������ �迭 �߰� ����
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 1; j++) {
				if (i == 0) {
					
				} else if (i == 1) {

				} else if (i == 2) {

				}
			}
		}
	}
}