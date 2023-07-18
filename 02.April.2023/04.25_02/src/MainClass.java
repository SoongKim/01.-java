
public class MainClass {//extends java.lang.Object
	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.doAction();
		t1.doAction(222);
		t1.doAction(222, 333);
		t1.doAction("STR");
		
		System.out.println();
		
		Object o1 = new Test();
		System.out.println(o1.toString());
		System.out.println();
		o1.toString();
	}
}
