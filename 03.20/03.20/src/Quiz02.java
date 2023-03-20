import java.util.Arrays;

public class Quiz02 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		String str = Arrays.toString(a);

		str.trim();
		//str = [1, 2, 3, 4, 5]
		
		String[] mobNum = str.split(",");
		
		for (int i = 0; i < mobNum.length; i++) {
			mobNum[i] = mobNum[i].replace("[", "");
			mobNum[i] = mobNum[i].replace("]", "");
//			mobNum[i] = mobNum[i].replace(" ", "");
			mobNum[i] = mobNum[i].trim();
			String ret = mobNum[i];
			System.out.println(ret);
		}
	}
}