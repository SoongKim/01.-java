import java.util.Scanner;

public class Circle extends Triangle {
	int radius;

	Circle() {
		this.name = "원";
	}
	@Override
	public void inputSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("반지름을 입력해주세요.");
		String userInput = scanner.nextLine();
		this.radius = Integer.parseInt(userInput);
	}
	@Override
	public void calcSize() {
		this.size = (this.radius * this.radius) * Math.PI;
	}
	@Override
	public void printSize() {
		System.out.println(this.name + " size : " + (int) size * 100 / (double) 100);
	}
}
