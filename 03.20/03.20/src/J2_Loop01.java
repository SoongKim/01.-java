import java.util.Arrays;

public class J2_Loop01 {

	public static void main(String[] args) {

//		double a[] = {1.1, 2.2, 3.3};

//		for(int i = 0; i< a.length; i++) {
//			System.out.println(a[i]);
//		}

//		String[] weekDay = {"월", "화", "수", "목", "금", "토", "일"};
//		if) 대괄호를 입력하지 않는다면
//		cannot convert from string[] to String
//		String : 문자열 자료

//		대괄호 []는 배열을 의미한다.

//		for(int i = 0; i<weekDay.length; i++) {
//			System.out.println(weekDay[i]);
//		}
//		까지가 복습

//		int[] num = new int[5];
		// new array []에 정수 값을 입력:
		// 몇 칸 잡을 것이라고 선언하는 의미를 지니고 있다.
		// 객실 몇 개를 예약할까? 로 인식하자.

//		String[] weekDay02 = new String[7];

//		int a = 3;
//		int b = 4;
//		how to swap a with b

//		int a01 = b; //4
//		int b01 = a; //3

//		a = a01;
//		b = b01;
//		새로운 공간을 만들고, 여기에 기존 값을 저장해주자.

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

		// 만약 최대값을 구한다면?

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
//		최소값을 담을 변수를 초기화 할 때는 어떤 값으로 초기화를 할까?
//      반대로 최대값을 담을 변수를 초기화 할 때는 어떤 값으로 초기화를 할까?

//		A) int min = Integer.MAX_VALUE, int max = Integer.MIN_VALUE;
//		최소값은 가장 큰 값으로, 최대값은 가장 작은 값으로 디폴트 세팅하여 오류를 방지하자.
//		local variable min have not been initialized 오류
//		: min 값이 초기화되지 않은 경우 발생하는 오류
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min)
				min = num[i];
			if (num[i] > max)
				max = num[i];
		// if문 내 한 줄 짜리는 중괄호 생략 가능
		}
		System.out.println("Min Value is " + min);
		System.out.println("Max Value is " + max);

	}
}