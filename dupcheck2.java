package ArrayTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 0~10 자연수 배열을 중복을 제거하고 오름차순으로 출력하시오.
 */
public class dupcheck2 {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/inputDC.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int N;
		int[] arr;
		int[] cnt;
		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			cnt = new int[11];
			arr = new int[N];
			for(int i=0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
		
		
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < i; j++) {
					if(arr[i] == arr[j]) {
						arr[i] = Integer.MIN_VALUE;
					}
				}
			}
			
			Arrays.sort(arr);
			for(int i = 0; i < arr.length; i++) {
				if(arr[i]!=Integer.MIN_VALUE) System.out.print(arr[i]);
			}
			
			
			System.out.println();
			
	    }
	}
		
		
		


		 
	
	}

