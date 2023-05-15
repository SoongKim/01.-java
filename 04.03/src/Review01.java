import java.util.Arrays;

public class Review01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = {"A", "B", "C", "D", "E"};
		int kor[] = {50, 60, 70, 80, 90};
		int eng[] = {10, 70, 80, 90, 100};
		int math[] = {95, 80, 90, 85, 80};
		
		//국영수 합산 순위대로 1~5위, 학생 이름 나오도록
		
		int total[] = new int[5];
		
		for (int i = 0; i < kor.length; i++) {
			total[i] = kor[i] + eng[i] + math[i];
		}
		
		for (int i = 0 ; i < total.length; i++) {
			for(int j = 0; j < total.length; j++) {
				if(total[i] < total[j]) {
					int temp = total[i];
					String temp02 = name[i];
					total[j] = total[i];
					name[j] = name[i];
					total[i] = temp;
					name[i] = name[j];
					name[j] = temp02;
				}
			}
		}
		
		System.out.println(total.length + Arrays.toString(name) + Arrays.toString(total));
		
		
//		System.out.println(Arrays.toString(total));
	}


}
