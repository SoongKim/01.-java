import java.util.Arrays;

public class J2_Loop01 {

	public static void main(String[] args) {

//		double a[] = {1.1, 2.2, 3.3};

//		for(int i = 0; i< a.length; i++) {
//			System.out.println(a[i]);
//		}

//		String[] weekDay = {"��", "ȭ", "��", "��", "��", "��", "��"};
//		if) ���ȣ�� �Է����� �ʴ´ٸ�
//		cannot convert from string[] to String
//		String : ���ڿ� �ڷ�

//		���ȣ []�� �迭�� �ǹ��Ѵ�.

//		for(int i = 0; i<weekDay.length; i++) {
//			System.out.println(weekDay[i]);
//		}
//		������ ����

//		int[] num = new int[5];
		// new array []�� ���� ���� �Է�:
		// �� ĭ ���� ���̶�� �����ϴ� �ǹ̸� ���ϰ� �ִ�.
		// ���� �� ���� �����ұ�? �� �ν�����.

//		String[] weekDay02 = new String[7];

//		int a = 3;
//		int b = 4;
//		how to swap a with b

//		int a01 = b; //4
//		int b01 = a; //3

//		a = a01;
//		b = b01;
//		���ο� ������ �����, ���⿡ ���� ���� ����������.

//		System.out.println(a);
//		System.out.println(b);

		// int a1[] = {1, 2, 3};
		// a1 is reference
		// a1[0] is value

//		int[] alpha01 = {1, 2, 3, 4, 5};
//		swap a[i] with a[i+1], i = 0 ->4

		int[] num = new int[5];
		num[0] = 2;
		num[1] = 3;
		num[2] = 1;
		num[3] = 5;
		num[4] = 4;

		// ���� �ִ밪�� ���Ѵٸ�?

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
//		�ּҰ��� ���� ������ �ʱ�ȭ �� ���� � ������ �ʱ�ȭ�� �ұ�?
//      �ݴ�� �ִ밪�� ���� ������ �ʱ�ȭ �� ���� � ������ �ʱ�ȭ�� �ұ�?

//		A) int min = Integer.MAX_VALUE, int max = Integer.MIN_VALUE;
//		�ּҰ��� ���� ū ������, �ִ밪�� ���� ���� ������ ����Ʈ �����Ͽ� ������ ��������.
//		local variable min have not been initialized ����
//		: min ���� �ʱ�ȭ���� ���� ��� �߻��ϴ� ����
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min)
				min = num[i];
			if (num[i] > max)
				max = num[i];
		// if�� �� �� �� ¥���� �߰�ȣ ���� ����
		}
		System.out.println("Min Value is " + min);
		System.out.println("Max Value is " + max);

	}
}