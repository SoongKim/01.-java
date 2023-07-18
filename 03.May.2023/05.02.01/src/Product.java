import java.util.Scanner;

public class Product {

	String name = "Defalut_Name";
	int price = 0;
	int count = 0;
	int rate = 0;
	int sumCount = 0;
	int isEmpty = 1;
	
	public void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("상품의 이름을 입력해주세요.");
		String productName = scanner.next();
		this.name = productName;
		System.out.println("상품의 가격을 입력해주세요.");
		String productPrice = scanner.next();
		this.price = Integer.parseInt(productPrice);
		System.out.println("상품의 입고 갯수를 입력해주세요.");
		String productCount = scanner.next();
		this.count = Integer.parseInt(productCount);
		System.out.println("상품의 할인율을 입력해주세요.(%)");
		String productRate = scanner.next();
		this.rate = Integer.parseInt(productRate);
		System.out.println("[입력정보확인]");
		System.out.println();
		System.out.println("상품 이름 : " + this.name + "| 상품 가격 : " + this.price + "| 입고 개수 : " + this.count + "| 상품 할인율(%) : " + this.rate);
		this.isEmpty--;
		System.out.println();
	}
	
	public void printInfo() {
			System.out.println("상품 정보를 출력합니다.");
			System.out.println("상품 이름 : " + this.name + "| 상품 가격 : " + this.price + " | 입고 개수 : " + this.count + " | 상품 할인율(%) : " + this.rate);
			System.out.println();	
	}
	
}
