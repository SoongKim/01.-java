import java.util.Random;

public class Triangle extends Base{

	Triangle(){
		this.name = "삼각형";
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
		this.size = this.width * this.height / (double)2;
	}
	
}
