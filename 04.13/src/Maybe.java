import java.util.Arrays;

public class Maybe {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 6, 3, 7, 4 };
		
		for(int q = 0; q < arr.length; q++) {
			for(int w = 0; w < arr.length; w++) {
				if(arr[q] < arr[w]) {
					int temp = arr[q];
					arr[q] = arr[w];
					arr[w] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		int[][] arr2 = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		String[] arr3 = new String[arr2.length];

		String c = "";

		for (int i = 0; i < arr.length; i++) {
			c = c + arr[i];
		}

		for (int j = 0; j < arr2.length; j++) {
			if(arr2[j][0] == arr2[j][1]) {
				arr3[j] = c.substring(arr2[j][0], arr2[j][0]+1);
			}
			else {
				arr3[j] = c.substring(arr2[j][0], arr2[j][1]);				
			}
		}

		System.out.println(Arrays.toString(arr3));

	}

}
