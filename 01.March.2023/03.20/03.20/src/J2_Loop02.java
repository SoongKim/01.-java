import java.util.Arrays;

public class J2_Loop02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1, 2, 3, 4, 5};
		
		String strTemp = Arrays.toString(a);
//		�ӽú��� strTemp ����ֱ�!
		System.out.println(strTemp);
		
		System.out.println(Arrays.toString(a));
// 		1���� 2���� ������ ����� �����ϴ� �����̴�.		
//		String str = "abc";
//		str += "def";
//		// String(���ڿ�)�� ���ϰ�, ���� �ڵ�� �޸𸮸� ���� ��ƸԴ´�.
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
		// ����: newLine, /r/n, <br> ��� �����ϴ�.
			System.out.print(joy[i] + " ");
		}
		
	
	
	}

}
