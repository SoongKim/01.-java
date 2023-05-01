
class Programmers01 {

	public int[] solution(int n, int m) {
		int[] answer = {};

		int[] arr01;
		int[] arr02;
				
		int index01 = 0; 
		for(int i = 1; i < n; i++) {
			if(i != 1 && i != 2 && n % 2 == 0) {
				index01++;
			}
		}
		arr01 = new int[index01];
		
		for(int i = 1; i < n; i++) {
			if(i != 1 && i != 2 && n % 2 == 0) {
				arr01[i] = i;
			}
		}
		
		int index02 = 0; 
		for(int i = 1; i < m; i++) {
			if(i != 1 && i != 2 && n % 2 == 0) {
				index01++;
			}
		}
		arr02 = new int[index02];
		
		for(int i = 1; i < m; i++) {
			if(i != 1 && m != 2 && n % 2 == 0) {
				arr02[i] = i;
			}
		}
		
		return answer;
	}
}