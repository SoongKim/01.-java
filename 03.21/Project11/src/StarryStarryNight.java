
public class StarryStarryNight {

	public static void main(String[] args) {
		

//////////////////////////////////////////////////////
		
//1.
		for(int i = 1; i < 6; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
		System.out.println("");
		}
		
		System.out.println("");
		
////////////////////////////////////////////////////
		
//2.
		for(int i = 2; i < 7; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(j);
			}
		System.out.println("");
		}
		
		System.out.println("");
		
///////////////////////////////////////////////////
		
//3.
		for(int i = 1; i < 6; i++) {
			
			for(int k = 5; k > i; k--) {
				System.out.print(" ");
			}
			for(int j = 0; j < 2*i-1; j++) {
				System.out.print(i);
			}
			System.out.println("");
			}
		
		System.out.println("");
		
///////////////////////////////////////////////
		
		//4.
		for(int i = 0; i < 8; i++) {
			
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			
			for(int j = 7; j > i;
					j--) {
				System.out.print("*");
			}
		System.out.println("");
		}
		
//////////////////////////////////////////////
	}
}