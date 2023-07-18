
public class Programmers06 {

	public static void main(String[] args) {
		boolean answer = true;
		String s = "pPoooyY";
		s = s.toUpperCase();
		System.out.println(s);
        int countP = 0;
        int countY = 0;
        for(int i = 0; i < s.length(); i++){
        	if(s.substring(i, i+1).equals("P")){
                countP++;
            }else if(s.substring(i, i+1).equals("Y")){
                countY++;
            }
        }

        if(countP != countY){
            answer = false;
        }
        System.out.println(answer);
	}
}
