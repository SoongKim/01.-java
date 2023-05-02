import java.util.Arrays;

public class Maybe2 {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] arr2 = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		String[] arr3 = new String[arr2.length];
		
		System.out.println(arr2.length);
		
		String c = "";
		for(int i = 0; i < arr.length; i++) {
			c = c + arr[i];
		}
		System.out.println(c);
				
		for(int q = 0; q < arr2.length; q++) {
			if(arr2[q][0] == arr2[q][1]) {
				arr3[q] = c.substring(arr2[q][0]-1, arr2[q][0]);
			}
			else {
				arr3[q] = c.substring(arr2[q][0]-1, arr2[q][1]);				
			}
		}
		System.out.println(Arrays.toString(arr3));
		// 1. arr을 arr2 [i][0] 인덱스에서 [i][1] 인덱스까지 자른다.
		// 2. 자른 arr을 arr3에 넣는다
		// 3. arr3.sort()해버린다.
		// 4. arr2 i+2인덱스 번째 숫자를 뱉어낸다.
		
	}
}