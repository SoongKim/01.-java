import java.util.Arrays;

public class Nameset01 {
	
	public static void main(String[] args) {


       String user = "HELLO NICE TO MEET YOU";
       
       String[]arr = new String[user.split(" ").length];
       
       for(int i = 0; i < user.split(" ").length; i++) {
    	   arr[i] = user.split(" ")[i];
       }
		
		System.out.println(Arrays.toString(arr));
		
		for(int j = 0; j < arr.length; j++) {
			for(int k = 0; k < arr[j].length(); k++) {
				if(k % 2 == 0) {
					
				}
			}
			
		}
		
    }
}