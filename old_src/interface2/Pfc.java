package interface2;

public class Pfc implements Soldier{

	@Override
	public void eat() {
		System.out.println("���� ���� �Ļ縦 �ϰ� ���ӵ��� ì�ܾ� �Ѵ�.");
	}

	@Override
	public void work() {
		System.out.println("���� ���� ��ġ�� ������� �����, ���ӵ� �ϵ� ���þ� �Ѵ�.");
	}

	@Override
	public void play() {
		System.out.println("���� ���� �ð��� �� Ȱ���Ͽ� ������� �뷡���� �� �� �ִ�.");
	}

	@Override
	public void sleep() {
		System.out.println("�ῡ �� ������ ��ħ 6�� 30�п� ���� ������.");
	}

	@Override
	public void salute() {
		System.out.println("��!��!");
	}

}




