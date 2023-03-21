import java.util.Arrays;
import java.util.Random;

public class fuckyou {
   public static void main(String[] args) {
      Random random = new Random();
      int randomNum = 0;
      int[] totalRandomNum = new int[5];
      int sortNum = 0;
      
      for (int i=0; i<5; i++) {
            randomNum = random.nextInt(101);
            totalRandomNum[i] = randomNum;
      }
      System.out.println("정렬 전 배열 : " + Arrays.toString(totalRandomNum));
      
      for (int i=0; i<5; i++) {
         for (int j=0; j<5; j++) {
            if(i>0 && totalRandomNum[i-1]>totalRandomNum[i]) {
               sortNum = totalRandomNum[i];
               totalRandomNum[i] = totalRandomNum[i-1];
               totalRandomNum[i-1] = sortNum;
            } else {
               
            }
         }
      }System.out.println(Arrays.toString(totalRandomNum));
   }
}