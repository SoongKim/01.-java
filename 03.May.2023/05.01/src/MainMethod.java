import java.util.Random;

public class MainMethod {

	String name;
	int height;
	int width;
	int half;
	double size;
	
	Random random = new Random();
	
	MainMethod(){
		this.height = random.nextInt(9)+1;
		this.width = random.nextInt(9)+1;
		this.half = random.nextInt(9)+1;
	}
	
	public void calcSize() {
		
	}
	public void printSize() {
		System.out.println(this.name + " 의 밑변은 " + this.width + "cm");
		System.out.println(this.name + " 의 높이은 " + this.height + "cm");
		System.out.println(this.name + "의 면적은 " + this.size + "cm^2 입니다.");
	}
	public void doAction() {
		this.calcSize();
		this.printSize();
	}
	
}
