import java.util.Arrays;

public class Maybe3 {

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] arr2 = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 }, { 1, 7, 3 } };

		int[][] arr3 = new int[arr2.length][arr.length];

		for (int i = 0; i < arr2.length; i++) {
			for (int j = arr2[i][0] - 1; j < arr2[i][1]; j++) {
				arr3[i][j] = arr[j];
			}
		}

		System.out.println(Arrays.deepToString(arr3));

		for (int k = 0; k < arr3.length; k++) {
			Arrays.sort(arr3[k]);
		}
		System.out.println(Arrays.deepToString(arr3));

		int[] arr4 = new int[arr2.length];

		int index = 0;
		for (int m = 0; m < arr3.length; m++) {
			for(int n = 0; n < arr3[m].length; n++) {
				if(arr3[m][n] == 0) {
					index++;
					continue;
				}
				else {
					arr4[m] = arr3[m][index + arr2[m][2]-1];					
					index = 0;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr4));
	}
}