
class Programmers01 {

	public long solution(int a, int b) {
		long answer = 0;
		int sol = 0;
		
		long alpha = (long)a;
		long beta = (long)b;
		if (alpha > beta) {
			for (long i = beta; i < alpha+1 ; i++) {
				sol += i;
			}
				answer = (long) sol;
				return answer;
		} else if (alpha < beta) {
			for (long i = alpha; i < beta+1; i++) {
				sol += i;
			}
			answer = (long) sol;
			return answer;
		} else {
			return alpha;
		}
	}

}
