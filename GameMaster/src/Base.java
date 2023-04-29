import java.util.Random;
import java.util.Scanner;
public class Base {

	double hp;
	int power;
	String name;
	int userCount;
	int attackpower;
	boolean isLive = true;
	boolean selected = false;
	Base(){
		this.hp = 100;
		this.name = "Default_Name";
		this.power = 10;
	}
	
	Scanner scanner = new Scanner(System.in);	
	Player01 p01 = new Player01();
	Player02 p02 = new Player02();
	Player03 p03 = new Player03();
	Player04 p04 = new Player04();
	Player05 p05 = new Player05();
	
	
	DiceModule dm = new DiceModule();
	Random random = new Random();
	// 기술 선택창. 각 클래스에서 @Override 받아 특성별로 입력해주세요.
	// 해당 Method를 통해 공격 데미지를 설정합니다.
	public void attackMethod() {
		System.out.println("공격 기술을 선택해주세요.");
		System.out.println("0 : 일반공격");
		System.out.println("1 : 기술공격");
		String attackSkill = scanner.next();
		if(attackSkill.equals("0")) {
			this.attackpower = dm.diceTen();
			// 일반공격 선택 시 10면체 주사위를 굴린 값을 공격 데미지로 저장합니다.
		}
		else if(attackSkill.equals("1")) {
			this.attackpower = dm.diceTen();
				//+alpha
			// 기술공격 선택 시 적용 로직 별로 데미지를 산정해주세요.
			// 데미지 산정 간에는 10면체를 기준으로 설정해주세요.
		}
	}
	
	public void autoAttack() {
		this.attackpower = dm.diceTen();
		int selUser = random.nextInt(4);
		System.out.println(this.name + " 이/가 "+ selUser +"를 대상으로 공격");
		
	}
	
	
	
	// 플레이어 1, 2, 3, 4, 5를 대상으로
	public void attack() {
		System.out.println("Select Enemy Number");
		System.out.println("1, 2, 3, 4, 5");
		String userSels = scanner.next();
		if(userSels.equals("0")){
			System.out.println(p01.name + "에게" + this.attackpower + "데미지!");
			System.out.println(p01.hp - this.attackpower);
			this.p01.hp = this.p01.hp - this.attackpower;
			p01.isLive();
			p01.toString();
		}
		else if(userSels.equals("1")){
			System.out.println(p02.name + "에게" + this.attackpower + "데미지!");
			System.out.println(p02.hp - this.attackpower);
			this.p02.hp = this.p02.hp - this.attackpower;
			p02.isLive();
			p02.toString();
		}
		else if(userSels.equals("2")){
			System.out.println(p03.name + "에게" + this.attackpower + "데미지!");
			System.out.println(p03.hp - this.attackpower);
			this.p03.hp = this.p03.hp - this.attackpower;
			p03.isLive();
			p03.toString();
		}
		else if(userSels.equals("3")){
			System.out.println(p04.name + "에게" + this.attackpower + "데미지!");
			System.out.println(p04.hp - this.attackpower);
			this.p04.hp = this.p04.hp - this.attackpower;
			p04.isLive();
			p04.toString();
		}
		else if(userSels.equals("4")){
			System.out.println(p05.name + "에게" + this.attackpower + "데미지!");
			System.out.println(p05.hp - this.attackpower);
			this.p05.hp = this.p05.hp - this.attackpower;
			p05.isLive();
			p05.toString();
		}
		else {
			System.out.println("올바른 캐릭터를 대상으로 선택해주세요.");
			this.attack();
		}
	}
	
	// hp를 1과 비교. 1 미만이라면 isLive를 false로 return
	//				1 이상이라면 isLive를 true로 return
	public boolean isLive() {
		if(this.hp < 1) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
	public String toString() {
		if(this.isLive()) {
			return this.name + " " +"(" + this.hp + ")";
		}
		else
			return this.name + " died";
	}
	
	public void doAction() {
		this.attackMethod();
		this.attack();
		this.toString();
	}
}
