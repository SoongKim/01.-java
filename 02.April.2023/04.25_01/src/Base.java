
public abstract class Base {
	String name;
	double size;
	double width;
	double height;
	double half;
	
	Base(){
		this.name = "도형";
		// Default Name 지정
	}
	
	protected abstract void inputSize();
	// 비어는 있지만 꼭 구현되어야만 하는 메소드
	// 이러한 경우, 중괄호를 지우고 닫아버릴 수 있다.
	// abstract. 추상화 클래스의 등장이다.
	
	protected abstract void calcSize();
	
	protected void printSize() {
		System.out.println(this.name + " size : " + this.size);
	}
	public void doAction() {
		this.inputSize();
		this.calcSize();
		this.printSize();
	}
	
}
