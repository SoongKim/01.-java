import java.util.Scanner;

public class Purchase {
	String name = "";
	double salesPrice = 0;
	String buyerName = "";
	String phone = "";
	String location = "";
	
	public void inputInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("구매하실 상품 이름을 입력해주세요.");
		String productName = scanner.next();
		this.name = productName;
		System.out.println("구매자 성함을 입력해주세요.");
		String buyerName = scanner.next();
		this.buyerName = buyerName;
		System.out.println("구매자 연락처 정보를 입력해주세요. ex) 000-0000-0000");
		String phone = scanner.next();
		this.phone = phone;
		System.out.println("구매자 배송 주소를 입력해주세요.");
		String location = scanner.next();
		this.location = location;
		
	}
	
	public void printInfo() {
		System.out.println("구매자 : " + this.buyerName + " | 연락처 : " + this.phone + " | 배송주소 : " + this.location);
		System.out.println("구매 상품 : " + this.name + "제품 구매가격 : " + this.salesPrice);
	}
	
}
