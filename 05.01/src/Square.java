
public class Square extends MainMethod{

	Square(){
		this.name = "사각형";
	}
	
	@Override
	public void calcSize() {
		this.size = this.width * this.height;
	}
	
}
