
public class J2_Loop03 {

	public static void main(String[] args) {
		// 2중 for문!

//		for(int i = 0; i <5; i++) {
//			System.out.println("i: "+ i);
//		
//			for(int j = 0; j < 5; j++) {
//				System.out.println("	j : " + j );
//			}
//		}

		for (int i = 2; i < 10; i++) {
			System.out.println(" ");
			System.out.println("9*9단 " + i + " 단 입니다.");
			System.out.println(" ");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
	}
}