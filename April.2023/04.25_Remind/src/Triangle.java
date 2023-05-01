import java.util.Scanner;

public class Triangle extends Base {
	protected int width;
	protected int height;

	Triangle() {
		this.name = "삼각형";
	}

	@Override
	protected void inputNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(this.name + "의 밑변 길이를 입력해주세요.");
		String inputString = scanner.nextLine();
		this.width = Integer.parseInt(inputString);
		System.out.println(this.name + " 의 높이를 입력해주세요.");
		inputString = scanner.nextLine();
		this.height = Integer.parseInt(inputString);
	}

	@Override
	protected void calcSize() {
		this.size = this.height * this.width / (double) 2;
	}
}
