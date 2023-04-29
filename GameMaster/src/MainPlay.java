import java.util.Arrays;
import java.util.Scanner;

public class MainPlay {

	public static void main(String[] args) {
		// 플레이어 클래스를 연결해주세요.
		Base[] base = new Base[5];
		Scanner scanner = new Scanner(System.in);
		
		base[0] = new Player01();
		base[1] = new Player02();
		base[2] = new Player03();
		base[3] = new Player04();
		base[4] = new Player05();
		
		System.out.println("PLAY GAME");
		System.out.println("캐릭터를 선택해주세요.");
		System.out.println("[0]: Player01");
		System.out.println("[1]: Player02");
		String userSelect = scanner.next();
		if(userSelect.equals("0")){
			base[0].selected = true;
		}
		else if(userSelect.equals("1")) {
			base[1].selected = true;
		}
		else if(userSelect.equals("2")) {
			base[2].selected = true;
		}
		else if(userSelect.equals("3")) {
			base[3].selected = true;
		}
		else if(userSelect.equals("4")) {
			base[4].selected = true;
		}
				
		System.out.println("게임을 시작합니다.");
		for(int i = 0; i < 3; i++) {
			for(int k = 0; i < base.length; k++) {
				if(base[k].isLive) {
				base[k].doAction();
				}
				else {
					continue;
				}
			}
			
			
		}
		
	}
}