package interface2;

public class Private implements Soldier{

	@Override
	public void eat() {
		System.out.println("õõ�� ���� �缭 90���� �ɾƼ� �Դ´�.");
	}

	@Override
	public void work() {
		System.out.println("���� ������ �������� ������� ����.");
	}

	@Override
	public void play() {
		System.out.println("��Ÿ���Ե� ���� �ϵ��� ���Ƽ� �޿��� ���.");
	}

	@Override
	public void sleep() {
		play();
		System.out.println("�ῡ ���� ���Ѵ�.");
	}

	@Override
	public void salute() {
		System.out.println("��!!!!!!!!!!!!!!!!!!!!!!!!��!!!!!!!!!!!!!!!!!!!!!!");
	}
}




