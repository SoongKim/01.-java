
class Hwang04_정수제곱근판별 {
	public static long solution(long n) {
		long answer = 0;
		long sol = n;

		for (long i = 1; i <= sol; i++) {
			if (i * i == sol) {
				answer = (i + 1) * (i + 1);
				break;
			} 
			else {
				answer = -1;
			}
		}
		return answer;
	}
}