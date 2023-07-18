import java.util.Scanner;

public class Menues{

public void menu(){
	MainClass mainC = new MainClass();
	Base[] base = new Base[5];
	DiceModule dm = new DiceModule();
	System.out.println("게임 플레이입니다.");
	System.out.println("원하시는 캐릭터를 선택해주세요.");
	System.out.println("1: | 2: | 3: | 4: | 5: ");
	Scanner scanner = new Scanner(System.in);
	String userSelect = scanner.next();
	if (userSelect.equals("1")) {
		base[0] = new First();
		base[0].round();
	} else if (userSelect.equals("2")) {
		base[1] = new Second();
		base[1].round();
	} else if (userSelect.equals("3")) {
		base[2] = new Third();
		base[2].round();
	} else if (userSelect.equals("4")) {
		base[3] = new Fourth();
		base[3].round();
	} else if (userSelect.equals("5")) {
		base[4] = new Fifth();
		base[4].round();
	} else {
		System.out.println("올바른 정보를 입력해주세요.");
	}
}
}