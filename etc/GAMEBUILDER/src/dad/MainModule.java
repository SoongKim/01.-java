package dad;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainModule {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		ArrayList<Base> arr = new ArrayList<Base>();

		arr.add(new Player01());
		arr.add(new Player02());
		arr.add(new Player03());
		arr.add(new Player04());
		arr.add(new Player05());

		System.out.println("Doungeon Master Activated");
		System.out.println();
		System.out.println("[Character Info]");
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(i + " : " + arr.get(i).name);
			System.out.println(arr.get(i).characterInfo);
		}
		System.out.println();
		System.out.println("캐릭터를 선택해주세요.");
		int playerSelectNum = Integer.parseInt(scanner.next());
		for (int num = 0; num < arr.size(); num++) {
			if (playerSelectNum == num) {
				arr.get(playerSelectNum).selected = true;
			}
		}

		// 입장 시퀀스. 플레이어 캐릭터의 입장 메세지가 출력됩니다.
		for (int login = 0; login < arr.size(); login++) {
			if (arr.get(login).selected) {
				System.out.println(arr.get(login).name + " 이/가 " + "투기장에 들어섭니다.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println("매캐한 폭연과 쇠사슬이 끌리는 스산한 소리, 그리고 피비린내가 사방에서 느껴집니다.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println(arr.get(login).name + "은 무기를 쥔 자신의 손이 떨려오는 것을 느낍니다.");
				System.out.println();
				System.out.println("자 이제, 투기장의 문이 열립니다.");
			}
		}

		////////////////////////////////////////////////////
		for (int i = 0; i < 50; i++) {
			// userCount가 1일 때, 홀로 userCount = 1인 플레이어가 최종 승자가 됩니다.
			if (arr.get(0).userCount + arr.get(1).userCount + arr.get(2).userCount + arr.get(3).userCount
					+ arr.get(4).userCount == 1) {
				for (int live = 0; live < arr.size(); live++) {
					if (arr.get(live).userCount == 1) {
						System.out.println();
						System.out.println("마침내 투기장에 단 한 명의 승자만이 남았습니다!");
						System.out.println(arr.get(live) + " 의 승리입니다!");
						break;
					}
				}
			} else {
				// 10 턴 이후부터 생존해있는 모든 플레이어에게 턴마다 1씩 누적 데미지를 입힙니다.
				// 이를 통해 게임의 장기화를 방지합니다.
				if (i > 9) {
					System.out.println("10턴이 경과하였습니다.");
					System.out.println("살아있는 플레이어는 매턴 1씩 증가하는 데미지를 입습니다.");
					for (int n = 0; n < 100; n++) {
						if (arr.get(0).isLive) {
							System.out.println(arr.get(0).name + " 에게 탈진 데미지" + (i - 9) + "!");
							arr.get(0).hp = arr.get(0).hp - (i - 9);
							arr.get(0).lifeMethod();
						}
						if (arr.get(1).isLive) {
							System.out.println(arr.get(1).name + " 에게 탈진 데미지" + (i - 9) + "!");
							arr.get(1).hp = arr.get(1).hp - (i - 9);
							arr.get(1).lifeMethod();
						}
						if (arr.get(2).isLive) {
							System.out.println(arr.get(2).name + " 에게 탈진 데미지" + (i - 9) + "!");
							arr.get(2).hp = arr.get(2).hp - (i - 9);
							arr.get(2).lifeMethod();
						}
						if (arr.get(3).isLive) {
							System.out.println(arr.get(3).name + " 에게 탈진 데미지" + (i - 9) + "!");
							arr.get(3).hp = arr.get(3).hp - (i - 9);
							arr.get(3).lifeMethod();
						}
						if (arr.get(4).isLive) {
							System.out.println(arr.get(4).name + " 에게 탈진 데미지" + (i - 9) + "!");
							arr.get(4).hp = arr.get(4).hp - (i - 9);
							arr.get(4).lifeMethod();
						}
					break;
					}
				}
				// sum(userCount) != 1인 경우, 플레이를 진행합니다.
				System.out.println();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println((i + 1) + "Round");

				// 유저 플레이어의 진행 간
				int usersss = 0;
				for (int users = 0; users < arr.size(); users++) {
					if (arr.get(users).selected == true) {
						usersss = users;
						System.out.println(arr.get(users).name + " 의 차례입니다.");
						System.out.println("현재 체력 : " + arr.get(users).hp + "/100");
						System.out.println();
						for (int let = 0; let < arr.size(); let++) {
							if (arr.get(let).userCount == 1 && let != usersss) {
								System.out.println("상대 : " + arr.get(let).name + " / HP : " + arr.get(let).hp + "/100");
							}
						}
						arr.get(users).doAction();
						System.out.println("공격할 적을 선택해주세요.");
						for (int enemy = 0; enemy < arr.size(); enemy++) {
							if (enemy == users) {
								continue;
							} else {
								System.out.println("[" + enemy + "]" + arr.get(enemy).name);
							}
						}
						String userSelEnemy = scanner.next();
						for (int attack = 0; attack < arr.size(); attack++) {
							if (Integer.parseInt(userSelEnemy) == attack) {
								System.out.println(arr.get(usersss).name + " 이/가 " + arr.get(attack).name + "에게 공격!");
								System.out.println(arr.get(usersss).anouncerMent());
								System.out.println("---------------------------------------");
								arr.get(attack).hp = arr.get(attack).hp - arr.get(usersss).attackpower;
								System.out.println(arr.get(attack).name + "의 남은 체력 : " + arr.get(attack).hp + "/100");
								arr.get(attack).isLive();
								System.out.println();
							} else {
								continue;
							}
						}
					}
					
					// non-player 캐릭터의 진행 간
					else {
						System.out.println(arr.get(users).name + " 의 차례입니다.");
						arr.get(users).doAuto();
						System.out.println(arr.get(users).name + " 이/가 공격할 대상을 찾습니다.");
						int enemySelec = random.nextInt(arr.size());
						if (enemySelec == users) {
							enemySelec = enemySelec - 1;
							if (users == 0) {
								enemySelec = 2;
							}
						}
						System.out.println(arr.get(users).name + " 이/가 " + arr.get(enemySelec).name + " 에게 공격!");
						System.out.println(arr.get(users).anouncerMent());
						arr.get(enemySelec).hp = arr.get(enemySelec).hp - arr.get(users).attackpower;
						System.out.println(arr.get(enemySelec).name + " 의 남은 체력 : " + arr.get(enemySelec).hp + " /100");
						arr.get(enemySelec).lifeMethod();
						System.out.println("---------------------------------------");
						System.out.println();

					}

				}

			}

		}
	}
}