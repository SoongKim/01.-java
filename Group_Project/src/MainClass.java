import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Menues men = new Menues();
		men.menu();
		Base base = new Base();
		base.fastPlay();
		
		First first = new First();
		
		for(int i = 0; i < 999999; i++) {
			for(int j = 0; j < base.userCount; j++) {
				if(base.tnstj[i]==1) {
					first.baseAttack();
				}else if(base.tnstj[i]==2) {
					
				}else if(base.tnstj[i]==3) {
					
				}else if(base.tnstj[i]==4) {
					
				}else if(base.tnstj[i]==5) {
					
				}
			}
			
			
			
			
			
			
		}
	}
}