import java.util.Random;

public class Square extends Base{

	Square(){
		this.name = "사각형";
	}
	
	@Override
	public void inputSize() {
		Random random = new Random();
		this.width = random.nextInt(50);
		this.height = random.nextInt(50);
		this.half = random.nextInt(50);
	}
	
	@Override
	public void calcSize() {
		this.size = this.width * this.height;
	}
}
