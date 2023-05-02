import java.util.Scanner;

public class Pf01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];
		int avg = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
			avg += num[i];
		}
		avg = avg / num.length;
		System.out.println(avg);
		// 평균값
		for (int j = 0; j < num.length; j++) {
			for (int q = 0; q < num.length; q++) {
				if (num[j] < num[q]) {
					int temp = num[j];
					num[j] = num[q];
					num[q] = temp;
				}
			}
		}
		System.out.println(num[2]);
		//중간값
	}
}