
public class ClassRoom {

	String name;// A반, B반, C반...
	Student[] student = new Student[100];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classroom classroom = new Classroom();
		for(int i = 0; i < 100; i++) {
			student[i] = new Student();
		}
		student[5].testInput();
		
		
		
	}
}