import java.util.Random;

public class Question07 {

	public static void main(String[] args) {
		Random random = new Random();
		int ranNum = random.nextInt(100);

		System.out.println("������ ���ڴ� " + ranNum);

		System.out.println("�Ҽ��� ������ �����ϴ�.");
		boolean primeNum = true;
		for (int i = 0; i < (ranNum + 1); i++) {
			if(i < 2) {
				continue;
			}
			for(int j = 2; j < i; j++){
				if(i % j != 0) {
					primeNum = true;
				}
				else {
					primeNum = false;
					break;
				}
			}
			if(primeNum) {
				System.out.print(i + " ");
			}
		}
	}
}