import java.util.Arrays;

public class Lecture_Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 아래 배열 선언을 그대로 사용하여 해당 배열에
		// 구구단 결과를 할당하고, 이를 출력하는 프로그램을 만드세요.
		int[][] res = new int[8][9];
		
		for(int i = 0; i < res.length; i++) {
		// 바깥 for 문은 행!
			for(int j = 0; j <res[i].length; j++) {
			// 안쪽 for 문은 열!
				res[i][j] = (i+2)*(j+1);
				// i는 2부터, j 는 1부터 시작하므로
				// 2와 1을 각각 더해준다.
			}
		}
		System.out.println(Arrays.deepToString(res));;
	}
}