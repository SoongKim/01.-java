import java.util.Scanner;

public class Function {

	String name = "����";
	int residenceSeoul = 0;
	boolean seoul = false;
	int residenceBusan = 0;
	boolean busan = false;
	int residenceGangwon = 0;
	boolean gangwon = false;
	int residenceChoongchung = 0;
	boolean choongchung = false;
	int residenceJeonra = 0;
	boolean jeonra = false;
	int residenceGyeongsang = 0;
	boolean gyeongsang = false;
	int maleCount = 0;
	int femaleCount = 0;
	boolean male = false;
	boolean female = false;
	
	public void name() {
		System.out.println("�̸��� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.nextLine();
		this.name = userName;
	}

	public void residence() {
		System.out.println("���� ������ �Է����ּ���.");
		System.out.println("1:����|2:���|3:����|4:��û|5:����|6:���");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		if (userInput.equals("1")) {
			this.seoul = true;
			this.residenceSeoul++;
		} else if (userInput.equals("2")) {
			this.busan = true;
			this.residenceBusan++;
		} else if (userInput.equals("3")) {
			this.gangwon = true;
			this.residenceGangwon++;
		} else if (userInput.equals("4")) {
			this.choongchung = true;
			this.residenceChoongchung++;
		} else if (userInput.equals("5")) {
			this.jeonra = true;
			this.residenceJeonra++;
		} else if (userInput.equals("6")) {
			this.gyeongsang = true;
			this.residenceGyeongsang++;
		}
	}

	public void gender() {
		System.out.println("������ �Է����ּ���.");
		System.out.println("1:����|2:����");
		Scanner scanner = new Scanner(System.in);
		String userGender = scanner.nextLine();
		if(userGender.equals("1")) {
			this.male = true;
			this.maleCount++;
		}
		else if(userGender.equals("2")) {
			this.female = true;
			this.femaleCount++;
		}
		else {
			System.out.println("�ùٸ� ���� �Է����ּ���.");
		}
	}
}
