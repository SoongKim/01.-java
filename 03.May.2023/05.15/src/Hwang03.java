
public class Hwang03 {

	public static void permutation(String[] arr, String[] out, boolean[] visited, int depth, int r) {
		if (depth == r) {
			for (String num : out)
				System.out.print(num);
			System.out.println();
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				out[depth] = arr[i];
				permutation(arr, out, visited, depth + 1, r);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = { "A", "B", "C"};
		int r = 3;
		permutation(arr, new String[r], new boolean[arr.length], 0, r);
	}
}