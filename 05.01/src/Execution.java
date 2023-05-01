import java.util.Scanner;

public class Execution {
	public static void main(String[] args) {
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println("원하시는 도형을 선택하세요.");
			System.out.println("[0]삼각형[1]사각형[2]원");
			Scanner scanner = new Scanner(System.in);
			String userInput = scanner.next();
			if(userInput.equals("0")) {
				Rectangle r = new Rectangle();
				r.doAction();
			}
			else if(userInput.equals("1")) {
				Square s = new Square();
				s.doAction();
			}
			else if(userInput.equals("2")) {
				Circle c = new Circle();
				c.doAction();
			}
			else {
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
		}
		
	}
}
