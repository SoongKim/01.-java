import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C_MainClass_PfVer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<D_Student_PfVer> student = new ArrayList<D_Student_PfVer>();
		for(int i = 0; i < 999999; i++) {
			System.out.println("학생정보포탈입니다.");
			System.out.println("[1]데이터입력");
			System.out.println("[2]전체출력");
			System.out.println("[3]최고성적자조회");
			System.out.println("[9]종료");
			String menuSelect = scanner.next();
			if(menuSelect.equals("1")) {
				student.add(new D_Student_PfVer());
			}
			else if(menuSelect.equals("2")) {
				System.out.println("전체출력");
				for(int j = 0; j < student.size(); j++) {
					System.out.println(student.get(j).printInfo());
				}
			}
			else if(menuSelect.equals("3")) {
				int maxScore = -1;
				for(int j = 0; j < student.size(); j++) {
					if(student.get(j).score > maxScore) {
						maxScore = student.get(j).score;
					}
				}
				for(int j = 0; j < student.size(); j++) {
					if(student.get(j).score == maxScore) {
						System.out.println("이름 : " + student.get(j).name + " | 점수 : " + student.get(j).score);
					}
				}
				// ArrayList를 Array로
//				D_Student_PfVer[] tmp = student.toArray(new D_Student_PfVer[student.size()]);
//				for(int i1 = 0; i1 < tmp.length; i1++) {
//					for(int i2 = 0; i2 < tmp.length; i2++) {
//						if(tmp[i1].score < tmp[i2].score) {
//							D_Student_PfVer t1 = tmp[i1];
//							tmp[i1] = tmp[i2];
//							tmp[i2] = t1;
//						}
//					}
//				}
//				student = (ArrayList<D_Student_PfVer>)Arrays.asList(tmp);
				// Array를 ArrayList로.
				// 굳이... Collections.sort를 사용하자. reverse도 용이하다.
			
//				Collections.sort(student, new Comparator<Student>() {
//					@Override
//					public int compare(D_Student_PfVer o1, D_Student_PfVer o2) {
//						return o1.score - o2.score;
//					}
//				});
			
			
			
			}
			else if(menuSelect.equals("9")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
			System.out.println();
		}
		
	}

}
