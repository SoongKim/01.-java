import java.util.Scanner;

public class primeNumber01 {

	public static void main(String[] args) {
		//�Ҽ� �Ǻ� ����. ����.
		Scanner scanner = new Scanner(System.in);

		int primeNumber = 0;

		System.out.println("���ڸ� �ϳ� �Է����ּ���.");
		String userInput = scanner.nextLine();
		int number = Integer.parseInt(userInput);

		boolean isPrime = true;
		//boolean isPrime�� �⺻ ���� "��"
		for (int i = 0; i < number; i++) { // for(int i = 0; i<10; i++)�� ���
			// number - 1���� �ݺ�
			if (i < 2) {
				continue;
			}

			if (number % i == 0) {
				// �������� 0�� ������. �������ٸ� �Ҽ��� �ƴϴ�.
				// �Ҽ��� �ƴ�
				isPrime = false;
				break;
				// �ش� ���̽��� ���Ѵٸ� isPrime = false�� ����
				// �ش� ���ڰ� �Ҽ��� �ƴ϶�� �����⸦ ������.			
			}

		}

		if (isPrime) {
			System.out.println("�Ҽ��Դϴ�.");
			//boolean = true �� ���, �ش� ���ڿ��� ���
		} else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
			//boolean = false�� ���ŵ� ���, �� ���ڿ��� ���
		}

//		������׽��� ü. ���ϴ� ����� �ƴϴ�.
//		�ش� ����� ����Ѵٸ�, ��� �Ҽ��� �����Ͽ��߸� �Ǻ��� �����ϴ�.
		
//		if(userInput % 2 == 0 && userInput != 2) {
//			System.out.println("�ش� ���ڴ� �Ҽ��� �ƴմϴ�.");
//		} else if(userInput % 3 == 0 && userInput != 3) {
//			System.out.println("�ش� ���ڴ� �Ҽ��� �ƴմϴ�.");
//		} else if(userInput % 5 == 0 && userInput != 5) {
//			System.out.println("�ش� ���ڴ� �Ҽ��� �ƴմϴ�.");
//		} else if(userInput % 7 == 0 && userInput != 7) {
//			System.out.println("�ش� ���ڴ� �Ҽ��� �ƴմϴ�.");
//		} else {
//			System.out.println("�ش� ���ڴ� �Ҽ��Դϴ�.");

	}
}