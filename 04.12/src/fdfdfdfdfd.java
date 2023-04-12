import java.util.Arrays;

public class fdfdfdfdfd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sol = "try hello world";
		
		int num = sol.trim().length();
		
		System.out.println(sol.length());
		System.out.println(sol.trim().length());
		System.out.println(sol.split(" ").length);
		
		String[] sol2 = new String[sol.split(" ").length];
		
		for(int i = 0; i < sol2.length; i++) {
			sol2[i] = sol.split(" ")[i];
		}
		System.out.println(Arrays.toString(sol2));
	
		String a = sol2[0].substring(0).toUpperCase();
		
		String[] arr = new String[num];
		
		int e = 0;
		for(int j = 0; j < sol2.length; j++) {
			for(int k = 0; k < sol2[j].length(); k++) {
				if(k % 2 == 0) {
					arr[e] = sol2[j].substring(k).toUpperCase();
					e++;
				}
				else if(k % 2 == 1) {
					arr[e] = sol2[j].substring(k).toLowerCase();
					e++;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
