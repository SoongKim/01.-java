import java.util.Scanner;

public class Order{

	String productName;
	int billingPrice;
	String buyerName;
	String phone;
	String location;
	
	public void doOrder(Product[] product) {
		for(int i = 0; i < product.length; i++) {
			String printString = "" + i + " : ";
			printString = printString + product[i].name;
			int discountPrice = product[i].price * product[i].discount / 100;
			int sellPrice = product[i].price - discountPrice;
			printString = printString + " " + sellPrice + "원";
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("구매를 원하는 상품 번호 입력");
		String inputString = scanner.next();
		int inputNumber = Integer.parseInt(inputString);
		this.productName = product[inputNumber].name;
		this.billingPrice = (int)(product[inputNumber].price * (100 - product[inputNumber].discount) / (double)100);
		
		System.out.println("주문자 이름 : " + this.buyerName + " | 주문 상품 : " + this.productName + " | 상품 할인적용가 : " + this.billingPrice);
	}
	
	@Override
	public String toString() {
		return this.productName + " " + this.billingPrice;
	}
}
