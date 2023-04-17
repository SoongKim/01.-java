import java.util.Arrays;

class Programmers03_ProtoType {
	public String solution(String s, int n) {
		String answer = "";

		String[] alp01 = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };
		String[] alp02 = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		String[] arr = new String[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.split("")[i];
		}
		System.out.println(Arrays.toString(arr));
		
		int[] sol = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < alp01.length; j++) {
				if (arr[i].equals(alp01[j])) {
					sol[i] = j;
				} else if (arr[i].equals(alp02[j])) {
					sol[i] = j;
				} else {
					arr[i] = " ";
				}
			}

		}
		System.out.println(Arrays.toString(sol));
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(" ")) {
				arr[i] = arr[i];
			} else if (arr[i].toUpperCase().equals(arr[i])) {
				if (sol[i] + n > 25) {
					arr[i] = alp01[(sol[i] + n - 25)];
				}
				arr[i] = alp01[sol[i] + n];
			} else {
				if (sol[i] + n > 25) {
					arr[i] = alp02[sol[i] + n - 25];
				}
				arr[i] = alp02[sol[i] + n];
			}
//			answer = answer + arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		
		return answer;
	}
}