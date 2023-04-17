import java.util.ArrayList;

class Programmers02 {

	public int solution(int n) {
		int answer = 0;

		int sol = n;
		ArrayList sols = new ArrayList();
		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				continue;
			}
			if (sol % i == 0) {
				sols.add(i);
			}
		}
		System.out.println(sols);
		for (int j = 0; j < sols.size(); j++) {
			answer = answer + (int) sols.get(j);
		}
		return answer;
	}

}
