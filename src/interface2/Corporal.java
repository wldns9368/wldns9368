package interface2;

public class Corporal implements Soldier{

	@Override
	public void eat() {
		System.out.println("���� ��ġ�� ���� �����Ӱ� �Ļ��Ѵ�.");
	}

	@Override
	public void work() {
		System.out.println("���� ���ø� �Ѵ�.");
	}

	@Override
	public void play() {
		System.out.println("�޷�����.");
	}

	@Override
	public void sleep() {
		System.out.println("���� �𸣰� �ܴ�.");
	}

	@Override
	public void salute() {
		System.out.println("�椵");
	}
	
}








