
public class Cauf02 {

	public void counting(double weight, double height) {
		double ratio = weight / (height*height);
		
		if(ratio < 20) {
			System.out.printf("%.3f", ratio);
			System.out.print(", ��ü��");
			if(ratio < 10) {
				System.out.print(", �Ҹ���");
			}
			else if(ratio < 13) {
				System.out.print(", ���� ������");
			}
			else if(ratio < 15) {
				System.out.print(", ����");
			}
		}
		else if(ratio < 24) {
			System.out.printf("%.3f", ratio);
			System.out.print(", ����");
			}
		else if(ratio < 29) {
			System.out.printf("%.3f", ratio);
			System.out.println(", ��ü��");
			}
		else {
			System.out.printf("%.3f", ratio);
			System.out.print(", ��");
			}	
	}
}