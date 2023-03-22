
public class tempQuiz {

	public static void main(String[] args) {
		for(int i = 0; i < 8; i++) {
			for(int k = 0; k < i; k++) {
			// ( k의 시작값; 가동범위; 변동폭)
				System.out.print(" ");
			}
			for(int j = 0; j <15-2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}