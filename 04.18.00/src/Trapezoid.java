import java.util.Scanner;

public class Trapezoid extends Triangle {
	int upperSide;

	Trapezoid() {
		this.name = "사다리꼴";
	}

	@Override
	public void inputSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("밑변을 입력하세요.");
		String inputString = scanner.nextLine();
		this.width = Integer.parseInt(inputString);
		System.out.println("윗변을 입력하세요.");
		inputString = scanner.nextLine();
		this.upperSide = Integer.parseInt(inputString);
		System.out.println("높이를 입력하세요.");
		inputString = scanner.nextLine();
		this.height = Integer.parseInt(inputString);
	}

	@Override
	public void calcSize() {
		this.size = ((this.width + this.upperSide) * this.height) / (double) 2;
	}
}
