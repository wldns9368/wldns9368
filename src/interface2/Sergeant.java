package interface2;

public class Sergeant extends Army{//�������̽��� �ƴ� �������̽��� ������� Ŭ���� Army�� ��ӹ޾� �ʿ��� �޼��常 ��� ������ �����ϴ�.
	@Override
	public void eat() {
		System.out.println("�ȸ԰� PX");
	}
	
	@Override
	public void sleep() {
		System.out.println("�Ϸ� ���� �ܴ�.");
	}
	
	@Override
	public void play() {
		System.out.println("�Ϸ� ���� ���.");
	}
	
}











