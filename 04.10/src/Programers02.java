import java.util.Scanner;

class Programers02 {

	public boolean solution(int x) {
		boolean answer = true;
		int usernum = x;
		String userNum = Integer.toString(x);
		String[] arr = userNum.split("");
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + Integer.parseInt(arr[i]);
		}
		if(Integer.parseInt(userNum)%sum == 0) {
			answer = true;
		}
		else {
			answer =  false;
		}
		return answer;
	}
}