import java.util.Arrays;

class Programmers03 {
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

		int[] sols = new int[arr.length];
		String[] sol2 = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < alp01.length; j++) {
				if (arr[i].equals(alp01[j])) {
					if (j + n > 25) {
						sol2[i] = alp01[j + n - 26];
					} else {
						sol2[i] = alp01[j + n];
					}
				} else if (arr[i].equals(alp02[j])) {
					if (j + n > 25) {
						sol2[i] = alp02[j + n - 26];
					} else {
						sol2[i] = alp02[j + n];
					}
				} else if (arr[i].equals(" ")) {
					sol2[i] = arr[i];
				}
			}
			answer = answer + sol2[i];
		}
		return answer;
	}
}