import java.util.Scanner;

public class CaufRatio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaufRatio caufRatio = new CaufRatio();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ī���� ���� �����Դϴ�.");
		System.out.println();
		System.out.println("�����Կ� Ű�� ���ʷ� �Է����ּ���.");
		System.out.println("�����Դ� kg, Ű�� m ������ �Է����ּ���.");
		
		double userWeight = scanner.nextDouble();
		double userHeight = scanner.nextDouble();
		
		if(userHeight > 3) {
			userHeight = userHeight / 100;
		}
		
		caufRatio.counting(userWeight, userHeight);
		scanner.close();
	}
	
	public void counting(double weight, double height) {
		double ratio = weight / (height*height);
		
		if(ratio < 10) {
			System.out.printf("%.3f", ratio);
			System.out.print(" , �Ҹ���");
		}
		else if(ratio < 13) {
			System.out.printf("%.3f", ratio);
			System.out.print(", ���� ������");
		}
		else if(ratio < 15) {
			System.out.printf("%.3f", ratio);
			System.out.print(", ����");
		}
		else if(ratio < 20) {
			System.out.printf("%.3f", ratio);
			System.out.print(", ��ü��");
		}
		else if(ratio < 24) {
			System.out.printf("%.3f", ratio);
			System.out.println(", ����");
		}
		else if(ratio < 29) {
			System.out.printf("%.3f", ratio);
			System.out.println(", ��ü��");
		}
		else {
			System.out.printf("%.3f", ratio);
			System.out.println(", ��");
		}
	}
}