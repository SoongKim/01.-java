import java.util.Arrays;

public class dfde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sol = "good night mister";

		int num = sol.length();
		int nums = sol.split(" ").length;

		String[] arr = new String[nums];
		
		String[] arr03 = new String[num];
		
		for (int i = 0; i < nums; i++) {
			arr[i] = sol.split(" ")[i];
		}

		String[] arr02 = new String[num];

		int index = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int k = 0; k < arr[j].length(); k++) {
				if (k % 2 == 0) {
					arr02[index] = arr[j].substring(k, k + 1).toUpperCase();
					index++;
				} else if (k % 2 == 1) {
					arr02[index] = arr[j].substring(k, k + 1).toLowerCase();
					index++;
				} 
//				else if() {
//					
//				}
			}
		}

		System.out.println(Arrays.toString(arr02));
	}
}