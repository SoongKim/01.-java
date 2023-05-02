
public class Hwang05_이상한문자만들기 {

	public String solution(String s) {
        String answer = "";
        String sol = s;
        String[] arr = new String[sol.length()];

        for(int i = 0; i < sol.length(); i++) {
            arr[i] = sol.substring(i, i+1);
        }

        int index = 0;
        for(int j = 0; j < sol.length(); j++) {
            if(arr[j].equals(" ")) {
                index = 0;
            }
            else if(index % 2 == 0) {
                arr[j] = arr[j].toUpperCase();
                index++;
            }
            else {
                arr[j] = arr[j].toLowerCase();
                index++;
            }
        }
        String f = "";
        for(int e = 0; e < sol.length(); e++) {
            answer = answer + arr[e];
        }
        return answer;
    }
}
