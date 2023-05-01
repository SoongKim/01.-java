import java.util.Arrays;

public class Question08 {

	public static void main(String[] args) {
		
//		String[][] nineNine = new String[9][9];
		
		
		
		
		
		for(int i = 3; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(i*j < 10) {
				System.out.println(i + " X " + j + " = " + i*j + " ");
				}
				else {
				System.out.println(i + " X " + j + " = " + i*j);	
				}
			}
		}
		
//		for(int i = 0; i < 29; i++) {
//			for(int j = 0; j < 5; j++) {
//				for(int k = 3; k < 10; k++) {
//					for(int y = 1; y < 10; y++) {
//						nineNine[i][j] = k+"X"+y+" = "+k*y;
//						if(i == 9 || i == 19) {
//							nineNine[9][j] = " ";
//							nineNine[19][j] = " ";
//						}
//						if(j == 2 || j == 4) {
//							nineNine[i][2] = " ";
//							nineNine[i][4] = " ";
//						}
//					}
//				}
//			}
//		}
//		for(String[]newNum : nineNine ) {
//			for(String newColumn : newNum) {
//				System.out.print(newColumn + " ");
//			System.out.println();
//			}
//		}	
	}
}