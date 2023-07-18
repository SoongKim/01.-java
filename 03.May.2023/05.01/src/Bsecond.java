
public class Bsecond {

	public int main(String a){
		int answer = 0;
		
		String sol = "";
		String act = a;
		String[]arr = new String[act.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = act.split("")[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[0].equals("0")) {
				answer = -1;
				return answer;
			}
			else if(arr[i].equals("0")){
				arr[i] = arr[i-1];
				sol = sol + arr[i];
			}
			else {
				sol = sol + arr[i];
			}
			answer = Integer.parseInt(sol);
		}
		return answer;
    }
}