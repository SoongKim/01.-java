import java.util.Scanner;

public class ExecClass04_Pfver02 {
	
	// �ϴ� Ŭ���� ���� ������ ������ Ÿ���� void�� ����
	// return ���� ������ Ÿ�Կ� ���� ���� �����ָ� �ȴ�.
	
	// �Է�
	public double inputWeight() {
		System.out.println("�����Ը� �Է����ּ���(����: kg)");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		double weight = Double.parseDouble(inputString);
		return weight;
	}
	public double inputHeight() {
		System.out.println("Ű�� �Է����ּ���(����: cm)");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		double height = Double.parseDouble(inputString);
		height = height /(double)100;
		return height;
	}
	
	// �� �� ���� ���� �� �ʿ� double�� ĳ���� ������.
	// ���� �߻� �� �� �� �ִ� ������ ������ �ذ����� �� �ִ�.
	public void calcKaup(double weight, double height){
		double result = (double)weight / (height * height);
		if(result > 30) {
			System.out.println("��");
		}else if(result > 24) {
			System.out.println("��ü��");
		}else if(result > 25) {
			System.out.println("����");
		}else if(result > 13) {
			System.out.println("��ü��");
		}else if(result > 10) {
			System.out.println("���� ������");
		}else {
			System.out.println("�Ҹ���");
		}
	}
}