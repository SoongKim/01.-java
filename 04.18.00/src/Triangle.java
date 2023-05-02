import java.util.Scanner;

public class Triangle {
	String name = "삼각형";
	int width;
	int height;
	double size;

	Triangle() {
		this.name = "삼각형";
	}

	public void inputSize() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("밑변을 입력하세요.");
		String inputString = scanner.nextLine();
		this.width = Integer.parseInt(inputString);
		System.out.println("높이를 입력하세요.");
		String inputString02 = scanner.nextLine();
		this.height = Integer.parseInt(inputString02);
	}

	public void calcSize() {
		this.size = (this.width * this.height) / (double) 2;
	}

	public void printSize() {
		System.out.println(this.name + " size : " + size);
	}

	public void doAction() {
		this.inputSize();
		this.calcSize();
		this.printSize();
	}
}
