import java.util.Scanner;

public class Circle extends Base {
	private double half;

	Circle() {
		this.name = "원";
	}

	@Override
	protected void inputNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("반지름을 입력해주세요.");
		String inputString = scanner.nextLine();
		this.half = Double.parseDouble(inputString);
	}

	@Override
	protected void calcSize() {
		this.size = Math.round((this.half * this.half * Math.PI) * 100) / (double) 100;
		// 소수점 두 번째 자리에서 반올림하여 출력하였습니다.
	}

	public void test() {
		super.printsize();
		this.printsize();
	}
	@Override
	protected void printsize() {
		super.printsize();
		System.out.println("bbbb");
	}
}