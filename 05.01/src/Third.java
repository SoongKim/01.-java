import java.io.FileInputStream;
//import java.util.Arrays;
import java.util.Scanner;

public class Third {
   public static void main(String[] args) throws Exception {
      System.setIn(new FileInputStream("src/Tpa2.txt"));
      Scanner sc = new Scanner(System.in);
      
      
      
      
      int y = sc.nextInt();
      int x = sc.nextInt();
      int[][] arr = new int[y][x];
      for (int i = 0; i < y; i++) {
         for (int j = 0; j < x; j++) {
            arr[i][j] = sc.nextInt();
         }
      }
      int length = sc.nextInt();
      String a = sc.nextLine();//버리는거(enter)
      String b ="";
      String c ="";
      for(int i=0; i<length; i++) {
         b = b+sc.nextLine();
      }
      c = b.replace(" ", "");
      String[]d = c.split("");
      for(int k=0; k<d.length; k++) {
         String answer = "";
         for(int i=0; i<y; i++) {
            for(int j=0; j<x; j++) {
               if((arr[i][j]) == Integer.parseInt(d[k])) {
                  answer = answer + "["+Integer.toString(i)+","+Integer.toString(j)+"]";
               }
            }
         }
         System.out.println(d[k]+"의 위치");
         System.out.println(answer);
      }
      
   }
}