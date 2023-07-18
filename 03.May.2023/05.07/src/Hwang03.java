class Hwang03 {
	public int solution(int num) {
	// 프로그래머스 콜라츠 추측 문제
		int answer = 0;
		double sol = num;
		double a = 2;
		int b = 3;
		for (int i = 0; i < 500; i++) {
			if (i >= 0 && i < 499) {
				if (sol == 1) {
					answer = i;
					break;
				} else if (sol % 2 == 0) {
					sol = sol / a;
					continue;
				} else if (sol % 2 == 1) {
					sol = (sol * b) + 1;
					continue;
				}
			} else if (i == 499 && sol != 1) {
				answer = -1;
			}
		}
		return answer;
	}
}