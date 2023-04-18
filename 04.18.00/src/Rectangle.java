import java.util.Scanner;

public class Rectangle extends Triangle {
// extends : 뒤의 클래스로부터 상속 받았음을 명시한다.
// 이후 다른 부분만 밑에 명시해둔다.
	Rectangle() {
		this.name = "사각형";
	}

	@Override
	// calcSize에 관한 부분을 Override했음을 명시하였다.
	public void calcSize() {
		this.size = (this.width * this.height);
	}

}
