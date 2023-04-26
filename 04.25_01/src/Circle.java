import java.util.Random;

public class Circle extends Base{

	Circle(){
		this.name = "원";
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
		this.size = (int)(this.half * this.half * Math.PI * 100) / (double) 100;
	}
	
}
