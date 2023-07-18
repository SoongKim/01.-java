import java.util.Arrays;
import java.util.Comparator;

public class Hwang01_Sort {

	public static void main(String[] args) {
		// ArraySort
		int[] arr = { 12, 43, 5, 4, 100, 88 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		// sort �˰����� ����� ���� ���� ����

		// Arrays.sort(arr, Collections.reverseOrder());
		// int type�� reverseOrder() ���� �Ұ��ϴ�! ���� �εյ���
		Integer[] arr02 = new Integer[arr.length];
		// Integer Ÿ���� ����ϱ� ���� ���ο� �迭�� ����
		// Integer = int type + a + b + c ...
		// �ƹ�ư ���� ����� ���� ���� Ÿ���� ������ Ÿ��
		for (int i = 0; i < arr02.length; i++) {
			arr02[i] = arr[i];
		}
		// arr02�� arr �����͸� ����
//		Arrays.sort(arr02, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr02));
		
//		myCompareClass mcc = new myCompareClass();
//		Arrays.sort(arr02, mcc );
//		System.out.println(Arrays.toString(arr02));
//		
		Comparator<Integer> myCompare = new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return b -a;
			}
		};
		// �ؿ��� ȣ���Ͽ��� �Լ��� �����ϰ� �ۼ����ش�.
		// ����� �����ϴ� ����� �ͼ��ϰ� ü���ص���.
		
		
		Arrays.sort(arr02, myCompare);
		System.out.println(Arrays.toString(arr02));
		
		Arrays.sort(arr02, new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i1 - i2;
			}
		});
		
		Arrays.sort(arr02, (a, b)->{
			return b - a;
		});
		System.out.println(Arrays.toString(arr02));
	}// End of Hwang01_Sort

	// public�� �ƴϴ�. �׳� class�� �����ߴ�.
	class myCompareClass implements Comparator<Integer> {
		// Comparator�� �ƹ� �� ���� ���Ǹ� �̷��� �ִ�.
		// ������ ȣ���� �ʿ��� �̷�����, �� �������� �ƹ� �͵� ����.
		// <> : Generic �̶�� ����. template�� ���� ����
		// <> <T>�� ������ Ÿ���� ���ǵ��� ���� ����. ��� �Ϳ� ���� ����
		// <Integer>�� �Է��ϸ� T�� Integer�� ��ü�ȴ�.
		public int compare(Integer a, Integer b) {
			return b - a;
		}
	}
}