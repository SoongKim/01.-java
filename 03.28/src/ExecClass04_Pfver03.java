import java.util.Scanner;

public class ExecClass04_Pfver03 {

	double weight = 0;
	double height = 0;
	//Ŭ������ �� ������ �Ʒ� �߰�ȣ ������ ��� ��� �����ϴ�.
	// �̸� Property ��� �Ѵ�.(��ü�� ���� �� �ִ� ��)
	public void inputVar(){
		System.out.println("�����Ը� �Է����ּ���(����: kg)");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		weight = Double.parseDouble(inputString);
		
		System.out.println("Ű�� �Է����ּ���(����: m)");
		inputString = scanner.nextLine();
		height = Double.parseDouble(inputString);
		height = height / (double)100;
	}
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