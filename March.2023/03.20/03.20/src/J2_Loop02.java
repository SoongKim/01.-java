import java.util.Arrays;

public class J2_Loop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1, 2, 3, 4, 5};
		
		String strTemp = Arrays.toString(a);
//		임시변수 strTemp 잡아주기!
		System.out.println(strTemp);
		
		System.out.println(Arrays.toString(a));
// 		1번과 2번은 동일한 기능을 수행하는 구문이당.		
//		String str = "abc";
//		str += "def";
//		// String(문자열)을 더하고, 빼는 코드는 메모리를 많이 잡아먹는다.
//		System.out.println(str);
		
		/* [1, 2, 3, 4, 5]
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 */

		int joy[] = {1, 2, 3, 4, 5};
		for(int i = 0; i < joy.length; i++) {
//			System.out.println(joy[i]);
		// 개행: newLine, /r/n, <br> 등과 동일하다.
			System.out.print(joy[i] + " ");
		}
		
	
	
	}

}
