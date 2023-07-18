import java.util.Arrays;
class Hwang06 {
    public int solution(int[] nums) {
        int answer = 0;
        int[] arr = nums;
        int lenArr = (int) (arr.length / (double) 2);
		Arrays.sort(arr);
		int index = 1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				index++;
				continue;
			}
		}
		if(index < lenArr) {
			answer = index;
		}
		else {
			answer = lenArr;
		}
        return answer;
    }
}