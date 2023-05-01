
public class Base {
	String name;
	double size;
	
	Base(){
		this.name="도형";
		//디폴트 이름을 설정
	}
	
	protected void inputNumber() {
		
	}

	protected void calcSize() {
		
	}
	protected void printsize() {
		System.out.println(this.name + " size : " + this.size);
	}
	public void doAction() {
		this.inputNumber();
		this.calcSize();
		this.printsize();
	}
}