
public class Hwang05 {

	public boolean solution(int x) {
	// 프로그래머스 하샤드 수 문제
	// x 자리수의 합으로 x가 나눠지면 x는 하샤드 수이다.
	// 자연수 x를 입력 받아 하샤드 수 여부를 판별하라.
		boolean answer = true;
		
		String userNum = Integer.toString(x);
		String[]arr = new String[userNum.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = userNum.split("")[i];
		}
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		
		if(x % sum == 0) {
			answer = true;
		}
		else {
			answer = false;
		}
		
		return answer;
	}
}
