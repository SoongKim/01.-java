import java.util.Arrays;

public class Question09 {

	public static void main(String[] args) {
		String[] listA = { "!$#^1!%#@", "#$@!^2!#$^", "!$#^3", "4!$#^", "!#$^5" };
		String senTence = Arrays.toString(listA);
		System.out.println("listA :" + senTence);

		String[] listB = new String[5];

		for (int i = 0; i < listB.length; i++) {
//			listA[i] = listA[i].replace("!", "").replace("@", "").replace("#", "").replace("^", "").replace("%", "").replace("$", "").replace("#", "");
			listA[i] = listA[i].replace("@", "");
			listA[i] = listA[i].replace("#", "");
			listA[i] = listA[i].replace("^", "");
			listA[i] = listA[i].replace("%", "");
			listA[i] = listA[i].replace("$", "");
			listA[i] = listA[i].replace("#", "");
			listA[i] = listA[i].replace("!", "");
//			listA[i] = listA[i].replaceAll("!", "@");
//			listA[i] = listA[i].replaceAll("#", "$");			
//			listA[i] = listA[i].replaceAll("%", "^");			
			listB[i] = listA[i];
		}
		for (int i = 0; i < listB.length; i++) {
			System.out.println("인덱스" + i + "번째의 값은" + listB[i] + "입니다.");
		}
	}
}