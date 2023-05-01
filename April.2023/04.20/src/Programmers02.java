class Programmers02 {
	public static void main(String[] args) {
		int answer = 0;
		int price = 30000;
		if (price >= 500000) {
			answer = (int)Math.floor(price * (1 - 0.2));
		} else if (price >= 300000) {
			answer = (int)Math.floor(price * (1 - 0.1));
		} else if (price >= 100000) {
			answer = (int)Math.floor(price * (1 - 0.05));
		} else {
			answer = price;
		}
		System.out.println(answer);
		int e = 7;
		int f = (int)(e/(double)2);
		System.out.println(f);
//		return answer;
	}
}