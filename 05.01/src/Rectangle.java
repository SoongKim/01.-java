
public class Rectangle extends MainMethod {

	Rectangle() {
		this.name = "사각형";
	}

	@Override
	public void calcSize() {
		this.size = this.height * this.width / (double)2;
	}
	
}
