
public class ExecClass05_SaveBox02 {

	public static void main(String[] args) {
		ExecClass05_SaveBox s1 = new ExecClass05_SaveBox();
		ExecClass05_SaveBox s2 = new ExecClass05_SaveBox();
		ExecClass05_SaveBox s3 = new ExecClass05_SaveBox();
		
		
		s1.setName("�Ǿ�");
		s2.setName("�䳢");
		// new �� ����� ���� Ŭ������ ȣ���ϸ�
		// �޸� �� �ҿ� �̸� �����Ѵ�.
		// ���� s1, s2 ���� ����� ���� ȣ���ϱ� ���� �̸��� ��
		
		s1.deposit();
		s1.deposit();
		
		// ��ȣ�� ���θ� Method
		// ��ȣ ���� ������ ���� ������ property
		
		s2.deposit();
		
		s1.withdraw();
		s2.withdraw();
		s3.withdraw();
		// s2.coin = 300;
		// coin ���� ������ �����ع��ȴ�. �ٶ������� ���� ���
		// �׷��� ���� ���α׷��ֿ����� ��Ȳ�� ���� �̸� ����ϱ⵵ ��
		// ��� Ȯ���� �� �� �ִٸ� ������ ���� ��Ȯ�� ���
		// �׷���, JAVA������ ��ü�� �ٷ�� ���� ����(Default)!
		
		
	// ������ �޼ҵ带 �ҷ��͵�, ���� ��ü�� ���� �ٸ� �̸����� �ҷ�����
	// �� �̸��� �ش��ϴ� �޼ҵ常 �����Ѵ�.
	// ���� �ٸ� ��(property)�� �����Ѵ�.
	// ���� ���� �ҷ� �Դٰ� �� �ϰ��Ͽ� �ൿ�ϴ� ���� �ƴϴ�!
	// �ᱹ ���α׷����� ��û�� ��û, ��û�� ����û���� �����Ѵ�.
	}
}