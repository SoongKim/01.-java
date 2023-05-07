
public class Hwang04 {

	public long main(long n) {
		// 정수 제곱근 판별
		// 정수 n이 어떠한 양의 정수 x의 제곱근인지 판별
		// x의 제곱이라면 x+1의 제곱을 리턴, 아니라면 -1을 리턴
		long answer = 0;
		long sol = n;
		
		for(long i = 1; i <= sol; i++) {
			if(i*i == sol) {
				answer = (i+1)*(i+1);
				break;
			}
			else {
				answer = -1;
			}
		}
		
		return answer;
	}
}