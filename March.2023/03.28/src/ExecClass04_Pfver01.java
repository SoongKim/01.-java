
public class ExecClass04_Pfver01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecClass04_Pfver02 pfVer = new ExecClass04_Pfver02();
		
		double weight = pfVer.inputWeight();
		double height = pfVer.inputHeight();
		pfVer.calcKaup(weight, height);
	}
}