import java.util.Arrays;

public class StringFunFact {

	public static void main(String[] args) {
		String a = "  abc d e ";
//		a = a.trim();
		System.out.println(a);
		
		String b = "hello";
		
		System.out.println(Arrays.toString(b.getBytes()));
		for(int i = 0; i < a.length(); i++) {
			System.out.println(a.charAt(i));
		}
		
		StringBuffer c = new StringBuffer("hello");
		System.out.println(c);
		c.append(1);
		System.out.println(c);
		c.append(2);
		System.out.println(c);
		c.append(3);
		System.out.println(c);
		
		
	}

}
