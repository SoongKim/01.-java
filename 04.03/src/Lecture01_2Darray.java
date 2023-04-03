import java.util.Arrays;

public class Lecture01_2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 보통의 경우 2차원 배열까지만 진행한다.
		// 3차원 배열의 경우 게임 부문에서 주로 사용
		// 행은 row, 열은 column이라고 한다.
		
		// 배열의 선언
		
		int[][]arr = {{10, 33, 44}, {27, 5, 98}};
		// 구조 : {(0,0), (0,1), (0,2)}
		//		 {(1,0), (1,1), (1,2)}
		
		int[][] a = {{1, 2, 3}, {4, 5, 6}};
		System.out.println(Arrays.deepToString(a));
		// toString으로 출력하면 해당 배열들의 메모리 내 주소가 출력된다.
		int[][] b = {{1,2}, {3,4}, {5,6}};
		// 2행 3열 배열을 3행 2열로 바꿔봤다.
		System.out.println(Arrays.deepToString(b));
		
		int[][] c = new int[2][2];
		int cnt = 0;
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
			// c[0].length : 0행의 길이
			// c[1].length : 1행의 길이
				c[i][j] = ++cnt;
			}
		}
		System.out.println(Arrays.deepToString(c));

	}
}