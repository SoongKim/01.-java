import java.util.Arrays;

public class Question08 {

	public static void main(String[] args) {
		
		String[][]nineNine = new String[9][9];
		// 가용 역량으로 해결 불가. 다음에 계속
//		for(int i = 0; i < 29; i++) {
//			for(int y = 0; y < 3; y++)
				for(int j = 2; j < 10; j++) {
					for(int k = 1; k < 10; k++) {
						nineNine[k-1][j-2] = (j + " X " + k + " = " + j*k);
					}
//				}
		}
		for(String[]newNum : nineNine) {
			for(String newColumn : newNum) {
			System.out.print(newColumn + " ");
			}
		System.out.println();
		}
		
	}
}