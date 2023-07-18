
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 상품 정보가 담긴 Class를 연결
		Product[] pro = new Product[1000];
		for (int e = 0; e < pro.length; e++) {
			pro[e] = new Product();
		}
		// 구매서 정보가 담긴 Class를 연결
		Purchase[] pur = new Purchase[1000];
		for (int pr = 0; pr < pur.length; pr++) {
			pur[pr] = new Purchase();
		}

		for (int i = 0; i < 999999; i++) {
			System.out.println("상품 관리 프로그램입니다. 메뉴를 선택해주세요.");
			System.out.println(
					"[1]상품등록 [2]상품 목록 출력 [3] 보유 상품 통계 확인 [4] 상품 정렬 및 출력 [5] 구매서 작성 [6]구매서 수정 [7] 상품 재고 수정[q]종료");
			String menuSelect = scanner.next();
			if (menuSelect.equals("1")) {
				System.out.println("상품 정보를 입력합니다.");
				System.out.println("몇 번 인덱스에 상품 정보를 저장할까요? (0~" + (pro.length - 1) + ")");
				int userSelect = Integer.parseInt(scanner.next());
				pro[userSelect].inputInfo();
			} else if (menuSelect.equals("2")) {
				System.out.println("입력받은 상품 목록을 출력합니다.");
				for (int j = 0; j < pro.length; j++) {
					if (pro[j].isEmpty == 0) {
						pro[j].printInfo();
					}
				}
			} else if (menuSelect.equals("3")) {
				// 입력 여부를 파악하고, 입력 대상 정보들을 가지고 sum 및 avg 기능 수행.
				System.out.println("통계 정보를 확인합니다.");
				System.out.println("[0] 총 상품 수 출력 | [1] 평균 가격 출력");
				String statInfo = scanner.next();
				if (statInfo.equals("0")) {
					System.out.println("총 보유 상품 수를 출력합니다.");
					int totSum = 0;
					for (int e = 0; e < pro.length; e++) {
						if (pro[e].isEmpty == 0) {
							totSum = totSum + pro[e].count;
						}
					}
					System.out.println("총 보유 상품의 갯수는 " + totSum + "개 입니다.");
				} else if (statInfo.equals("1")) {
					System.out.println("총 보유 상품의 평균 가격을 출력합니다.");
					int totCount = 0;
					int totPrice = 0;
					for (int z = 0; z < pro.length; z++) {
						if (pro[z].isEmpty == 0) {
							totCount = Math.abs(totCount + 1);
							totPrice = Math.abs(totCount + pro[z].price);
						}
					}
					double avgPrice = Math.round(totPrice / (double) totCount);
					System.out.println("총 보유 상품의 평균 가격은 약 " + Math.round(avgPrice) + "원 입니다.");
					// 정확한 나누기 방법을 숙지하지 못하였습니다. 분모를 (double)로 나눠도 오류가 발생합니다. 죄송합니다.
				} else {
					System.out.println("올바른 정보를 입력해주세요.");
				}
			} else if (menuSelect.equals("4")) {
				// Selection Sort를 사용하여 이름과 가격/할인율 정보를 새로운 배열에 담고, 이를 함께 조작하여 출력합니다.
				int nullCount = 0;
				for (int k = 0; k < pro.length; k++) {
					if (pro[k].isEmpty == 0) {
						nullCount++;
					}
				}
				int[] arr = new int[nullCount];
				String[] arr2 = new String[nullCount];
				int count = 0;
				int temp = 0;
				String names = "";
				System.out.println("보유 상품을 정렬하여 출력합니다.");
				System.out.println("정렬 기준을 선택해주세요.");
				System.out.println("[1] 높은 가격순 [2] 낮은 가격순[3] 높은 할인율순[4] 낮은 할인율순");
				String sortSelect = scanner.next();

				if (sortSelect.equals("1")) {
					System.out.println("높은 가격 순으로 보유 상품 목록을 출력합니다.");
					for (int c = 0; c < pro.length; c++) {
						if (pro[c].isEmpty == 0) {
							arr[count] = pro[c].price;
							arr2[count] = pro[c].name;
							count++;
						}
					}
					for (int a = 0; a < nullCount; a++) {
						for (int b = 0; b < nullCount; b++) {
							if (arr[a] > arr[b]) {
								temp = arr[a];
								names = arr2[a];
								arr[a] = arr[b];
								arr2[a] = arr2[b];
								arr[b] = temp;
								arr2[b] = names;
							}
						}
					}
					for (int c = 0; c < nullCount; c++) {
						System.out.println("상품명 : " + arr2[c] + " 상품가격 : " + arr[c]);
					}

				} else if (sortSelect.equals("2")) {
					System.out.println("낮은 가격 순으로 보유 상품 목록을 출력합니다.");

					for (int c = 0; c < pro.length; c++) {
						if (pro[c].isEmpty == 0) {
							arr[count] = pro[c].price;
							arr2[count] = pro[c].name;
							count++;
						}
					}
					for (int a = 0; a < nullCount; a++) {
						for (int b = 0; b < nullCount; b++) {
							if (arr[a] < arr[b]) {
								temp = arr[a];
								names = arr2[a];
								arr[a] = arr[b];
								arr2[a] = arr2[b];
								arr[b] = temp;
								arr2[b] = names;
							}
						}
					}
					for (int c = 0; c < nullCount; c++) {
						System.out.println("상품명 : " + arr2[c] + " 상품가격 : " + arr[c]);
					}

				} else if (sortSelect.equals("3")) {
					System.out.println("높은 할인율 순으로 보유 상품 목록을 출력합니다.");
					for (int c = 0; c < pro.length; c++) {
						if (pro[c].isEmpty == 0) {
							arr[count] = pro[c].rate;
							arr2[count] = pro[c].name;
							count++;
						}
					}
					for (int a = 0; a < nullCount; a++) {
						for (int b = 0; b < nullCount; b++) {
							if (arr[a] > arr[b]) {
								temp = arr[a];
								names = arr2[a];
								arr[a] = arr[b];
								arr2[a] = arr2[b];
								arr[b] = temp;
								arr2[b] = names;
							}
						}
					}
					for (int c = 0; c < nullCount; c++) {
						System.out.println("상품명 : " + arr2[c] + " 상품할인율 : " + arr[c]);
					}

				} else if (sortSelect.equals("4")) {
					System.out.println("낮은 할인율 순으로 보유 상품 목록을 출력합니다.");

					for (int c = 0; c < pro.length; c++) {
						if (pro[c].isEmpty == 0) {
							arr[count] = pro[c].rate;
							arr2[count] = pro[c].name;
							count++;
						}
					}
					for (int a = 0; a < nullCount; a++) {
						for (int b = 0; b < nullCount; b++) {
							if (arr[a] < arr[b]) {
								temp = arr[a];
								names = arr2[a];
								arr[a] = arr[b];
								arr2[a] = arr2[b];
								arr[b] = temp;
								arr2[b] = names;
							}
						}
					}
					for (int c = 0; c < nullCount; c++) {
						System.out.println("상품명 : " + arr2[c] + " 상품할인율 : " + arr[c]);
					}
				} else {
					System.out.println("올바른 기준을 선택해주세요.");
				}

			} else if (menuSelect.equals("5")) {
				System.out.println("구매서를 작성합니다.");
				System.out.println("한 번에 한 상품에 대응하는 구매서가 작성 가능합니다.");
				System.out.println("몇 번 인덱스에 구매서를 저장할까요?");
				String purInfo = scanner.next();
				int purInfoes = Integer.parseInt(purInfo);
				if (purInfoes < pur.length && purInfoes >= 0) {
					pur[purInfoes].inputInfo();
					for (int let = 0; let < pro.length; let++) {
						// 가격*할인율로 판매가 형성. 이를 상품 구매서의 가격 정보로 활용합니다.
						if (pur[purInfoes].name.equals(pro[let].name)) {
							// 10원 단위 절상(*100하여 ceil한 후, 100으로 다시 나눠줍니다.)
							pur[purInfoes].salesPrice = ((pro[let].price * (100 - pro[let].rate)) / (double) 100);
							pur[purInfoes].salesPrice = Math.ceil(pur[purInfoes].salesPrice * 100) / (double) 100;
						}
					}
					// 품절처리
					if (pur[purInfoes].salesPrice == 0) {
						System.out.println("해당 상품은 품절되었습니다.");
					}
					// 품절에 해당하지 않는 경우 구매서 내역을 출력
					else {
						pur[purInfoes].printInfo();
					}
				}
			} else if (menuSelect.equals("6")) {
				System.out.println("구매서를 수정합니다.");
				System.out.println("몇 번 인덱스에 담긴 정보를 수정할까요?(연락처 / 주소 한정");
				String indexInfo = scanner.next();
				int indexInfoes = Integer.parseInt(indexInfo);
				System.out.println("수정할 연락처 정보를 입력해주세요.(기존의 데이터는 지워집니다.)");
				String newPhone = scanner.next();
				pur[indexInfoes].phone = newPhone;
				System.out.println("수정할 주소 정보를 입력해주세요.(기존의 데이터는 지워집니다.)");
				String newLocation = scanner.next();
				pur[indexInfoes].location = newLocation;
				System.out.println("새로운 연락처 정보는 " + pur[indexInfoes].phone + ", 새로운 주소 정보는 " + pur[indexInfoes].location
						+ " 입니다.");
			} else if (menuSelect.equals("7")) {
				System.out.println("상품 재고 정보를 수정합니다.");
				System.out.println("몇 번 인덱스에 담긴 상품을 수정할까요?");
				String userInput = scanner.next();
				int userInputs = Integer.parseInt(userInput);
				System.out.println("수정할 재고 정보를 입력해주세요.");
				int newCount = Integer.parseInt(scanner.next());
				pro[userInputs].count = newCount;
				System.out.println(pro[userInputs].name + " 의 수량이 " + pro[userInputs].count + "로 수정되었습니다.");
			} else if (menuSelect.equals("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println();
		}

	}

}
