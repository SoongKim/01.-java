
public class Circle extends MainMethod{

	Circle(){
		this.name = "원";
	}
	
	@Override
	public void calcSize() {
		this.size = (int)((this.half * this.half * Math.PI)*100)/(double)100;
	}
	
	@Override
	public void printSize() {
		System.out.println("반지름은 " + this.half);
		System.out.println("면적은 " + this.size + "cm^2 입니다.");
	}
}
