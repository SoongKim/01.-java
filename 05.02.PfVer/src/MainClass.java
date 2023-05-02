import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Product[] product = { new Product("양말", 1000, 2, 5), new Product("셔츠", 1000, 10, 0),
				new Product("치마", 1000, 5, 10), new Product("넥타이", 10000, 8, 7), new Product("와이셔츠", 50000, 7, 15),
				new Product("운동화", 20000, 2, 8) };
		Order[] order = new Order[100];
		
		ProductList productList = new ProductList();
		int orderIndex = 0;
		for (int i = 0; i < 999999; i++) {
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("1. 상품 목록 출력");
			System.out.println("2. 상품 목록 (가격 높은 순)");
			System.out.println("3. 주문서 확인");
			System.out.println("4. 주문");
			System.out.println("5. 통계");
			System.out.println("6. 프로그램 종료");
			String userSelect = scanner.next();
			
			if (userSelect.equals("1")) {
				for (int j = 0; j < product.length; j++) {
					productList.showList(product);
				}
			} else if (userSelect.equals("2")) {
				productList.showPriceHigh(product);
			} else if (userSelect.equals("3")) {
			} else if (userSelect.equals("4")) {
				productList.showList(product);
				order[orderIndex] = new Order();
				order[orderIndex].doOrder(product);
				orderIndex++;
			} else if (userSelect.equals("5")) {
				productList.statistics(product);
			} else if (userSelect.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
			System.out.println();

		}

	}

}
