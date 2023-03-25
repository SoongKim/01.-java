import java.util.Arrays;

public class Question09 {

	public static void main(String[] args) {
		String[] listA = { "!$#^1!%#@", "#$@!^2!#$^", "!$#^3", "4!$#^", "!#$^5" };
		String senTence = Arrays.toString(listA);
		System.out.println("listA :" + senTence);

		String[] listB = new String[5];

		for (int i = 0; i < listB.length; i++) {
//			listA[i] = listA[i].replace("!", "").replace("@", "").replace("#", "").replace("^", "").replace("%", "").replace("$", "").replace("#", "");
			// 이와 같이 동일한 기능을 반복하는 경우, 한 줄로 길게 늘여 표현할 수도 있다.\
			// 해당 코드는 아래 코드와 동일한 기능을 수행한다.
			
			listA[i] = listA[i].replace("@", "");
			listA[i] = listA[i].replace("#", "");
			listA[i] = listA[i].replace("^", "");
			listA[i] = listA[i].replace("%", "");
			listA[i] = listA[i].replace("$", "");
			listA[i] = listA[i].replace("#", "");
			listA[i] = listA[i].replace("!", "");
			
			listB[i] = listA[i];
		}
		//인덱스 내 값이 해당 특수 문자를 포함하고 있는 경우, 이를 제거한 값을 새로운 리스트 값으로 치환하는 명령.
		for (int i = 0; i < listB.length; i++) {
			System.out.println("인덱스" + i + "번째의 값은" + listB[i] + "입니다.");
		}
	}
}