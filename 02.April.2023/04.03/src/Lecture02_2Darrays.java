import java.lang.annotation.Target;
import java.util.Arrays;

public class Lecture02_2Darrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] org = {{1,2}, {3,4}};
		int[][] tar = new int[2][2];
		
		// 2중 배열의 값 복사하기.
		for(int i = 0; i < org.length; i++) {
		// 위 for 문은 행을 다룬다.
			for(int j = 0; j < org[i].length; j++) {
			// 아래 for 문은 열을 다룬다.
				tar[i][j] = org[i][j];
			}
		}
		System.out.println(Arrays.deepToString(org));
		System.out.println();
		System.out.println(Arrays.deepToString(tar));
		
		
		// 위와 동일한 arraycopy 기능을 알아보자.
		int[][]arr02 = {{11, 22}, {33, 44}};
		int[][]arr03 = new int[2][2];
		
		System.arraycopy(arr02, 0, arr03, 0, arr02[0].length);
		System.out.println(Arrays.deepToString(arr03));
		// arr02를 arr03에 카피하였다.
//		arraycopy(A,B,C,D,E) :
//		A : 값을 가져올 배열
//		B : A 배열 몇 행부터? 처음부터 가져올거면 0으로
//		C : 값을 뒤집어 쓸 배열
//		D : C 배열 몇 행부터? 처음부터 가져올거면 0으로
//		E : 배열 길이. 어디까지 가져올지
	}
}