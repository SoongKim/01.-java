import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class F_Colatz {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double N = Double.parseDouble(st.nextToken());
		int answer = 0;
		if (N == 1) {
			System.out.println(0);
		} else {
			int count = 0;
			while (count <= 500) {
				if (N % 2 == 0) {
					N = F_Colatz.even(N);
					count++;
				} else {
					N = F_Colatz.odd(N);
					count++;
				}
				if (N == 1) {
					break;
				}
				if (count == 500 && N != 1) {
					System.out.println(-1);
				}
			}
			answer = count;
			System.out.println(answer);
		}
	}

	static double even(double number) {
		double answer = number / (double) 2;
		return answer;
	}

	static double odd(double number) {
		double answer = (number * 3) + 1;
		return answer;
	}
}

class Solution2{
	public int solution(int num) {
		int answer = 0;
		double sol = (double)num;
		if(sol == 1) {
			return answer;
		}
		else {
			int count = 0;
			while(count <= 500) {
				if(sol % 2 == 0) {
					sol = Solution2.even(sol);
					count++;
				}
				else {
					sol = Solution2.odd(sol);
					count++;
				}
				if(sol == 1) {
					return count;
				}
			}
			answer = -1;
		}
		return answer;
	}
	
	static double odd(double answer) {
		double sol = (answer * 3) + 1;
		return sol;
	}
	static double even(double answer) {
		double sol = answer / (double) 2;
		return sol;
	}
}
