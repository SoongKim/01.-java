import java.util.Random;

public class First extends Base {
   double defence = 0.8;
   String name;
   String [] attactName= {"기본공격", "Attack1", "Attack2"};
   First(){
	   this.name = "MIRROR";
	   this.attactName= {};
   }
   int lastDamage = 0;
   int damage = 10;
//   int[] attAndSuccessRate = new int[2];
   boolean use = false;

//   --기본 공격 10
//   기본 방어 계수 0.2 
//   명중률이 10-20이 넘어야지 공격이 들어간다
//   주사위굴림(20면체)를 바탕으로 선공권 싸움.

//   기본 명중 80% 기준

//   10턴 베이스
   Random random = new Random();

//   공격 받는다
   public void underAttack(int attack) {

//      if (successRateEnemy > 10) {
      this.hp = this.hp - (int) Math.round(attack * this.defence);
//         반격모드 진입
//         reflect(lastDamage);
//      } else {
//         lastDamage = 0;
//      }
   }

////   패시브 - 반격 데미지 - 
//   public void reflect(int lastDamage) {
//      int successRate = random.nextInt(101);
//
//      if (successRate > 10 && this.hp < 50) {
//         this.hp = this.hp - lastDamage;
//      }
//      if (successRate > 40 && this.hp >= 50) {
//         this.hp = this.hp - lastDamage;
//      }
//   }

   public String [] attactNameOutput() {
	      return attactName;
	   }
  
   
//   공격 1 - 기본
   public int baseAttack() {
      return damage;
   }

//   공격 - 응용 1
   public int Attack1() {
      if (this.hp > 90) {
         damage = 10;
      } else if (this.hp > 80) {
         damage = (int) Math.round(damage * 1.1);
      } else if (this.hp > 70) {
         damage = (int) Math.round(damage * 1.2);
      } else if (this.hp > 60) {
         damage = (int) Math.round(damage * 1.3);
      } else if (this.hp > 50) {
         damage = (int) Math.round(damage * 1.4);
      } else {
         damage = (int) Math.round(damage * 1.5);
      }

      return damage;
   }

//   공격 - 응용 2
   public int Attack2() {
      if (!use) {
//         int successRate = random.nextInt(101);
         damage = (int) Math.round(damage * 3);
      } else {
// 생각해보기 
      }
      return damage;
   }

}