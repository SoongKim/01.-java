import java.util.Scanner;

public class Main_Lecture_01 {

	public static void main(String[] args) {
	
	int fHund, hund, fif, ten, fiv, one = 0;
		
	int money = 1000;
	
	Scanner scanner = new Scanner(System.in);
	
	int inputPrice = Integer.parseInt(scanner.next());

	int leftMon = money - inputPrice;
	
	fHund = (int)(leftMon /(double)500);
	
	leftMon = leftMon - 500*fHund;
	
	hund = (int)(leftMon / (double)100);
	
	leftMon = leftMon - 100*hund;
	
	ten = (int)(leftMon / (double)10);
	
	leftMon = leftMon - 10*ten;
	
	fiv = (int)(leftMon / (double) 5);
	
	leftMon = leftMon - 5*fiv;
	
	one = leftMon;
	
	int cal = fHund + hund + ten + fiv + one;
	
	System.out.println(cal);
	
	}

}
