class Solution {
	public String solution(String my_string, String letter) {
		String answer = "";
		String[] sol = new String[my_string.length()];
		for (int i = 0; i < my_string.length(); i++) {
			sol[i] = my_string.substring(i, i + 1);
			if (!sol[i].equals(letter)) {
				answer += sol[i];
			}
		}
		return answer;
	}
}